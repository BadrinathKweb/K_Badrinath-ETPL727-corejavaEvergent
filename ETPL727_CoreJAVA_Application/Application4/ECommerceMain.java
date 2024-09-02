package Com.evergent.corejava.BadrinathK.Application4;

import java.util.Scanner;

public class ECommerceMain {
	
    public static void main(String[] args) {
        // Create an instance of ECommerceApplication
        
        UserLogin ul= new UserLogin();
        String name=ul.login();
        ECommerceApplication app = new ECommerceApplication(name);
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
        	
            app.showMainMenu();
            String moduleInput = scanner.nextLine();
            app.handleModule(moduleInput);
            
        }
    }
}
