package Com.evergent.corejava.BadrinathK.application;
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case #1
        System.out.println("Test case #1:");
        // Creating and testing KidUser
        KidUser kidUser1 = new KidUser();
        kidUser1.registerAccount(10);  // Valid age for KidUser
        kidUser1.requestBook("Kids");  // Valid bookType for KidUser
        KidUser kidUser2 = new KidUser();
        kidUser2.registerAccount(18);  // Invalid age for KidUser
        kidUser2.requestBook("Fiction");  // Invalid bookType for KidUser
        // Test case #2
        System.out.println("Test case #2:");
        // Creating and testing AdultUser
        AdultUser adultUser1 = new AdultUser();
        adultUser1.registerAccount(5);  // Invalid age for AdultUser
        adultUser1.requestBook("Kids");  // Invalid bookType for AdultUser
        AdultUser adultUser2 = new AdultUser();
        adultUser2.registerAccount(23);  // Valid age for AdultUser
        adultUser2.requestBook("Fiction");  // Valid bookType for AdultUser
    }
}







