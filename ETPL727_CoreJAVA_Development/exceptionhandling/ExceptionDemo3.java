package Com.evergent.corejava.exceptionhandling;
// If a class two exceptions , the developer should handle the first exception and then the 2nd exception will be handled
public class ExceptionDemo3 {
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
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed1= new ExceptionDemo3();
		ed1.myData();

	}

}
