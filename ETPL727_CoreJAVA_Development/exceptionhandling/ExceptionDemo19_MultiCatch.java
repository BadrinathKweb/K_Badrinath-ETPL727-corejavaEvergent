package Com.evergent.corejava.exceptionhandling;
/* All Exceptions are executed while abnormal conditions only
 * In Normal flow it wont execute any exceptions
 */
public class ExceptionDemo19_MultiCatch {
	String name =null;
	public void myData() {
	try {
		System.out.println("One");
		System.out.println(name.length());
		System.out.println(10/0);
		System.out.println("End");
	}
	catch(NullPointerException | ArithmeticException e) {
		System.out.println("I can Handle "+e);
	}
	}
	public static void main(String[] args) {
		ExceptionDemo19_MultiCatch ed1= new ExceptionDemo19_MultiCatch();
		ed1.myData();

	}

}
