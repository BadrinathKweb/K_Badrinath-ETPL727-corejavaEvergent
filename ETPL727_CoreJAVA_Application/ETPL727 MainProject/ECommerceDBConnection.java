package Com.evergent.mainproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ECommerceDBConnection {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Update driver name if using a different database
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/evergentdb",
                "root",
                "admin"
            );
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver not found", e);
        }
    }
}
