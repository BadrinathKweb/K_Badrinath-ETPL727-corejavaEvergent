package Com.evergent.mainproject.dao;
import java.util.List;
import java.util.Scanner;

public class ECommerceApplication {
    private ECommerceService eCommerceService = new ECommerceService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            showMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    handleUserRegistration();
                    break;
                case 2:
                    handleUserLogin();
                    break;
                case 3:
                    handleAddProduct();
                    break;
                case 4:
                    handlePlaceOrder();
                    break;
                case 5:
                    handleAddTransaction();
                    break;
                case 6:
                    handleViewTransactions();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("1. Register User");
        System.out.println("2. Login");
        System.out.println("3. Add Product");
        System.out.println("4. Place Order");
        System.out.println("5. Add Transaction");
        System.out.println("6. View Transactions");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    private void handleUserRegistration() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        User newUser = new User(username, password);
        int result = eCommerceService.createUser(newUser);
        if (result > 0) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Registration failed.");
        }
    }

    private void handleUserLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        User loginUser = new User(username, password);
        boolean authenticated = eCommerceService.authenticateUser(loginUser);
        if (authenticated) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }


    private void handleAddProduct() {
        System.out.print("Enter product code: ");
        String productCode = scanner.nextLine();
        System.out.print("Enter product description: ");
        String description = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        int result = eCommerceService.addProduct(productCode, description, price);
        if (result > 0) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Failed to add product.");
        }
    }

    private void handlePlaceOrder() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter product code: ");
        String productCode = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter total amount: ");
        double totalAmount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        int orderId = eCommerceService.placeOrder(username, productCode, quantity, totalAmount);
        if (orderId > 0) {
            System.out.println("Order placed successfully. Order ID: " + orderId);
        } else {
            System.out.println("Failed to place order.");
        }
    }

    private void handleAddTransaction() {
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter service type: ");
        String serviceType = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        int result = eCommerceService.addTransaction(orderId, serviceType, amount);
        if (result > 0) {
            System.out.println("Transaction added successfully.");
        } else {
            System.out.println("Failed to add transaction.");
        }
    }

    private void handleViewTransactions() {
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        List<String> transactions = eCommerceService.getTransactions(orderId);
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transactions:");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public static void main(String[] args) {
        ECommerceApplication app = new ECommerceApplication();
        app.start();
    }
}
