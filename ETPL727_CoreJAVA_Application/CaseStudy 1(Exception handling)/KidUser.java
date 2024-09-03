package Com.evergent.corejava.BadrinathK.application;
public class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    public void registerAccount(int age) {
        this.age = age;
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account.");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid.");
        }
    }


    public void requestBook(String btype) {
        this.bookType = btype;
        if ("Kids".equalsIgnoreCase(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 10 days.");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
