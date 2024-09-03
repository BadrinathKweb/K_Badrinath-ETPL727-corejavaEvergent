package Com.evergent.corejava.exceptionhandling;

public class Exception_NestedTryCatch20 {
	String name="null";
	int k=0;
	public void myData() {
		try {
			System.out.println("oNe");
			System.out.println(name.length());
			try {
				int t=10/k;
			}
			catch(ArithmeticException e) {
				System.out.println("Nested Try"+e);
			}
			finally {
				System.out.println("finally block inner try");
			}
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("I can Handle : "+e);
		}
		finally {
			System.out.println("outer final block");
		}
	}
	public static void main(String[] args) {
		Exception_NestedTryCatch20 el = new Exception_NestedTryCatch20();
		el.myData();
		
	}

}
