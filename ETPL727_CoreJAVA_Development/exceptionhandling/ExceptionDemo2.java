package Com.evergent.corejava.exceptionhandling;
/* All Exceptions are executed while abnormal conditions only
 * In Normal flow it wont execute any exceptions
 */
public class ExceptionDemo2 {
	String name =null;
	public void myData() {
	try {
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	catch(NullPointerException e) {
		System.out.println("I can Handle "+e);
	}
	}
	public static void main(String[] args) {
		ExceptionDemo2 ed1= new ExceptionDemo2();
		ed1.myData();

	}

}
