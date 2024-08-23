package Com.evergent.corejava.exceptionhandling;
//try followed by either catch or finally block
public class ExceptionDemo6finally2 {
	String name ="null";
	int k=2;
	public void myData() {
	try {
		System.out.println("One");
		System.out.println(name.length());
		int t=10/k;
		System.out.println("End");
	}
	
	finally {
		System.out.println("finally block for closing db connections");
	}
	}
	public static void main(String[] args) {
		ExceptionDemo6finally2 ed1= new ExceptionDemo6finally2();
		ed1.myData();

	}

}
