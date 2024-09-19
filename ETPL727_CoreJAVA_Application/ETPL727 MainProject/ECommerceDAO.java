package Com.evergent.mainproject.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ECommerceDAO {

    // Method to add a new user
    public int createUser(String username, String password) {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (Connection con = ECommerceDBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Method to authenticate a user
    public boolean authenticateUser(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection con = ECommerceDBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to add a new product
    public int addProduct(String productCode, String description, double price) {
        String sql = "INSERT INTO products (product_code, description, price) VALUES (?, ?, ?)";
        try (Connection con = ECommerceDBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, productCode);
            pstmt.setString(2, description);
            pstmt.setDouble(3, price);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Method to place an order
    public int placeOrder(String username, String productCode, int quantity, double totalAmount) {
        String sql = "INSERT INTO orders (username, product_code, quantity, total_amount) VALUES (?, ?, ?, ?)";
        try (Connection con = ECommerceDBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, username);
            pstmt.setString(2, productCode);
            pstmt.setInt(3, quantity);
            pstmt.setDouble(4, totalAmount);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1); // Return the generated order ID
                }
            }
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Method to add a transaction
    public int addTransaction(int orderId, String serviceType, double amount) {
        String sql = "INSERT INTO transactions (order_id, service_type, amount) VALUES (?, ?, ?)";
        try (Connection con = ECommerceDBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, orderId);
            pstmt.setString(2, serviceType);
            pstmt.setDouble(3, amount);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Method to get transactions for an order
    public List<String> getTransactions(int orderId) {
        String sql = "SELECT service_type, amount FROM transactions WHERE order_id = ?";
        List<String> transactions = new ArrayList<>();
        try (Connection con = ECommerceDBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, orderId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                transactions.add("Service: " + rs.getString(1) + ", Amount: RM" + rs.getDouble(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
}

