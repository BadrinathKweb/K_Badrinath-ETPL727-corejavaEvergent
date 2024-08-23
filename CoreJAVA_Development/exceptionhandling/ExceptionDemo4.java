package Com.evergent.corejava.exceptionhandling;
// we should follow exceptions hierarchically
public class ExceptionDemo4 {
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
	
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed1= new ExceptionDemo4();
		ed1.myData();

	}

}
