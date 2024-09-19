package Com.evergent.mainproject.dao;
import java.util.List;

import java.util.List;

public class ECommerceService {
    private ECommerceDAO eCommerceDAO = new ECommerceDAO();

    public int createUser(User user) {
        // Use the User bean to access username and password
        return eCommerceDAO.createUser(user.getUsername(), user.getPassword());
    }

    public boolean authenticateUser(User user) {
        // Use the User bean for authentication
        return eCommerceDAO.authenticateUser(user.getUsername(), user.getPassword());
    }

    public int addProduct(String productCode, String description, double price) {
        return eCommerceDAO.addProduct(productCode, description, price);
    }

    public int placeOrder(String username, String productCode, int quantity, double totalAmount) {
        int orderId = eCommerceDAO.placeOrder(username, productCode, quantity, totalAmount);
        return orderId;
    }

    public int addTransaction(int orderId, String serviceType, double amount) {
        return eCommerceDAO.addTransaction(orderId, serviceType, amount);
    }

    public List<String> getTransactions(int orderId) {
        return eCommerceDAO.getTransactions(orderId);
    }
}
