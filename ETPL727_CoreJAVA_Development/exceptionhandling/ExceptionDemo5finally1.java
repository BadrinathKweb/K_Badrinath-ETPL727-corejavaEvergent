package Com.evergent.corejava.exceptionhandling;
//finally, is block, if exceptions occurs or not occurs finally block will be executed
public class ExceptionDemo5finally1 {
	String name ="null";
	int k=0;
	public void myData() {
	try {
		System.out.println("One");
		System.out.println(name.length());
		int t=10/k;
		System.out.println("End");
	}
	catch(NullPointerException e) {
		System.out.println("I can Handle "+e);
	}
	catch(ArithmeticException e) {
		System.out.println("I can Handle "+e);
	}
	catch(Exception e) {
		System.out.println("I can Handle "+e);
	}
	finally {
		System.out.println("finally block for closing db connections");
	}
	}
	public static void main(String[] args) {
		ExceptionDemo5finally1  ed1= new ExceptionDemo5finally1();
		ed1.myData();

	}

}
