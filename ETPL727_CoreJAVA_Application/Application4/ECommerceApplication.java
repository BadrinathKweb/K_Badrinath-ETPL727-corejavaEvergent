package Com.evergent.corejava.BadrinathK.Application4;


import java.util.Scanner;

public class ECommerceApplication extends ECommerceBase implements ECommerceOperations {
	public ECommerceApplication(String name) {
		System.out.println("Holla "+name);
	}
    enum Module {
        L, C, P, Q
    }

    enum Submodule1 {
        C, S, M
    }

    enum Submodule2 {
        D, M
    }

    enum Submodule3 {
        T, P, M
    }

    enum MenuCode1 {
        A1, B1, A2, B2
    }

    public ECommerceApplication() {
        amount = 0;
        additionalItemCost = 0;
        selectedWatchCode = "";
    }

    public void showMainMenu() {
        
        System.out.println("======================");
        System.out.println("ECAW Main Menu");
        System.out.println("======================");
        System.out.println("L - List Module");
        System.out.println("C - Cart Module");
        System.out.println("P - Payment Module");
        System.out.println("Q - Quit Module");
        System.out.println("======================");
        System.out.print("Enter your Module code (L, C, P, Q): ");
    }

    public void handleModule(String moduleInput) {
        Scanner scanner = new Scanner(System.in);
        switch (Module.valueOf(moduleInput)) {
            case L:
                handleListModule(scanner);
                break;
            case C:
                handleCartModule(scanner);
                break;
            case P:
                handlePaymentModule(scanner);
                break;
            case Q:
                System.out.println("Exiting the application...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid module code. Please try again.");
                break;
        }
    }

    private void handleListModule(Scanner scanner) {
        System.out.println("");
        System.out.println("");
        System.out.println("Lists Module");
        System.out.println("======================");
        System.out.println("C - To view Categories");
        System.out.println("S - To place for other services");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (C, S, M): ");

        String submodule1Input = scanner.nextLine();
        switch (Submodule1.valueOf(submodule1Input)) {
            case C:
                viewCategories();
                break;
            case S:
                handleServices(scanner);
                break;
            case M:
                break;
            default:
                System.out.println("Invalid submodule code. Returning to main menu.");
                break;
        }
    }

    private void viewCategories() {
        System.out.println("Welcome to categories");
        System.out.println("Menu \t Description \t\t\t Charge per unit");
        System.out.println("===============================================");
        System.out.println("D - Digital Watches");
        System.out.println("===============================================");
        System.out.println("A1 \t Smartwatch Series X \n \t GPS Tracking \n \t Heart Rate Monitor \n \t 7-Day Battery Life \t\t\t RM250.00");
        System.out.println();
        System.out.println("B1 \t Fitness Tracker Pro \n \t Step Counter \n \t Sleep Monitoring \n \t 14-Day Battery Life \t\t\t RM150.00");
        System.out.println("===============================================");
        System.out.println("N - Normal Watches");
        System.out.println("===============================================");
        System.out.println("A2 \t Classic Leather Watch \n \t Elegant Design \n \t Quartz Movement \n \t Water Resistant \t\t\t RM120.00");
        System.out.println();
        System.out.println("B2 \t Sports Analog Watch \n \t Durable Strap \n \t Date Function \n \t Shock Resistant \t\t\t RM85.00");
        System.out.println("===============================================");
        System.out.print("Enter your Watch code (A1, A2, B1, B2): ");

        Scanner scanner = new Scanner(System.in);
        String watchCode = scanner.nextLine();
        selectedWatchCode = watchCode;

        switch (MenuCode1.valueOf(watchCode)) {
            case A1:
                System.out.println("Selected watch");
                System.out.println("A1 \t Smartwatch Series X \n \t GPS Tracking \n \t Heart Rate Monitor \n \t 7-Day Battery Life \t\t\t RM250.00");
                amount = 250;
                break;
            case B1:
                System.out.println("Selected watch");
                System.out.println("B1 \t Fitness Tracker Pro \n \t Step Counter \n \t Sleep Monitoring \n \t 14-Day Battery Life \t\t\t RM150.00");
                amount = 150;
                break;
            case A2:
                System.out.println("Selected watch");
                System.out.println("A2 \t Classic Leather Watch \n \t Elegant Design \n \t Quartz Movement \n \t Water Resistant \t\t\t RM120.00");
                amount = 120;
                break;
            case B2:
                System.out.println("Selected watch");
                System.out.println("B2 \t Sports Analog Watch \n \t Durable Strap \n \t Date Function \n \t Shock Resistant \t\t\t RM85.00");
                amount = 85;
                break;
            default:
                System.out.println("Invalid watch code. Returning to list module.");
                break;
        }
    }

    private void handleServices(Scanner scanner) {
        System.out.println("Service Selection");
        System.out.println("======================");
        System.out.println("1 - Guarantee (5% of price)");
        System.out.println("2 - Warranty (2% of price)");
        System.out.println("======================");
        System.out.print("Enter your Menu code (1, 2): ");

        String serviceCode = scanner.nextLine();
        int serviceCost;
        switch (serviceCode) {
            case "1":
                System.out.println("Selected Service - Guarantee card");
                serviceCost = (int) (amount * 0.05);
                System.out.println("Your Guarantee card costs: RM" + serviceCost);
                additionalItemCost = serviceCost;
                break;
            case "2":
                System.out.println("Selected Service - Warranty card");
                serviceCost = (int) (amount * 0.02);
                System.out.println("Your Warranty card costs: RM" + serviceCost);
                additionalItemCost = serviceCost;
                break;
            default:
                System.out.println("Invalid service code. Returning to list module.");
                break;
        }
    }

    private void handleCartModule(Scanner scanner) {
        System.out.println("");
        System.out.println("");
        System.out.println("Cart Module");
        System.out.println("======================");
        System.out.println("D - To display the summary of orders and payments made");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (D, M): ");

        String submodule2Input = scanner.nextLine();
        switch (Submodule2.valueOf(submodule2Input)) {
            case D:
                displayOrderSummary();
                break;
            case M:
                break;
            default:
                System.out.println("Invalid submodule code. Returning to main menu.");
                break;
        }
    }

    private void displayOrderSummary() {
        System.out.println("\tSummary Of Order");
        switch (selectedWatchCode) {
            case "A1":
                System.out.println("\t Smartwatch Series X \n \t GPS Tracking \n \t Heart Rate Monitor \n \t 7-Day Battery Life \t\t\t RM250.00");
                break;
            case "B1":
                System.out.println("\t Fitness Tracker Pro \n \t Step Counter \n \t Sleep Monitoring \n \t 14-Day Battery Life \t\t\t RM150.00");
                break;
            case "A2":
                System.out.println("\t Classic Leather Watch \n \t Elegant Design \n \t Quartz Movement \n \t Water Resistant \t\t\t RM120.00");
                break;
            case "B2":
                System.out.println("\t Sports Analog Watch \n \t Durable Strap \n \t Date Function \n \t Shock Resistant \t\t\t RM85.00");
                break;
            default:
                System.out.println("No watch selected.");
                break;
        }
        int totalAmount = amount + additionalItemCost;
        System.out.println("======================");
        System.out.println("You selected watch: RM" + amount);
        System.out.println("Your Additional Cost: RM" + additionalItemCost);
        System.out.println();
        System.out.println("Total Amount to be Paid: RM" + totalAmount);
        System.out.println("Amount to be paid after discount: RM" + (totalAmount - (totalAmount * 0.1)));
    }

    private void handlePaymentModule(Scanner scanner) {
        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("T - To display total amount to be paid");
        System.out.println("P - To make payment");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (T, P, M): ");

        String submodule3Input = scanner.nextLine();
        switch (Submodule3.valueOf(submodule3Input)) {
            case T:
                System.out.println("Total Amount to be Paid: RM" + amount);
                break;
            case P:
                System.out.println("To Make Payment: RM" + amount);
                System.out.println("You can use different modes for payments:");
                System.out.println("1- Credit card");
                System.out.println("2- Debit Card");
                System.out.println("3- UPI");
                System.out.println("4- Cash on Delivery");
                break;
            case M:
                break;
            default:
                System.out.println("Invalid module code. Returning to main menu.");
                break;
        }
    }
}
