package Com.evergent.corejava.exceptionhandling;
//throws an exception will be executed method by method
public class ExceptionDemo8 {
	String name =null;
	public void myData() throws NullPointerException{
		System.out.println("One");
		System.out.println(name.length());
	
	}
	public void myInfo() throws NullPointerException{
		myData();
		System.out.println("My Info Methods");
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo8 ed1= new ExceptionDemo8();
		ed1.myInfo();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("hello");
		}
	}

}
