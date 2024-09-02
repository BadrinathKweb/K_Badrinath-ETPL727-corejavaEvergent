package Com.evegent.corejava.interface1;

public class BookImpl2 implements NewBook {
	public void mydata() {
		System.out.println("My data interface");
		
	}
	public void addnewbook() {
		System.out.println("Java New Version");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl2 b1=new BookImpl2();
		b1.mydata();
		b1.addnewbook();
		
	}
	

}
