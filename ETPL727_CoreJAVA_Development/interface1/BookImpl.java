package Com.evegent.corejava.interface1;

public class BookImpl implements Book {
	public void bookTitle() {
		System.out.println("Core Java");
	}
	public void bookAuthor() {
		System.out.println("Oracle Company");
	}
	public void bookPrice() {
		System.out.println("1000");
	}
	public void show() {
		System.out.println("show is local method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl b1=new BookImpl();
		b1.bookAuthor();
		b1.bookTitle();
		b1.bookPrice();
		b1.show();
	}

}
