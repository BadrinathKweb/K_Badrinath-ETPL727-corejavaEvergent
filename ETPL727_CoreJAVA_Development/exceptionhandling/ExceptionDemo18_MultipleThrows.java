package Com.evergent.corejava.exceptionhandling;
//throws an exception will be executed method by method
public class ExceptionDemo18_MultipleThrows {
	String name =null;
	public void myData() throws NullPointerException,ArithmeticException{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println(10/0);
	
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo18_MultipleThrows ed1= new ExceptionDemo18_MultipleThrows();
		ed1.myData();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
