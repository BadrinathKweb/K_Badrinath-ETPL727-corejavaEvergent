package Com.evergent.corejava.exceptionhandling;
//throws an exception will be executed method by method
public class ExceptionDemo7 {
	String name =null;
	public void myData() throws NullPointerException{
		System.out.println("One");
		System.out.println(name.length());
	
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo7 ed1= new ExceptionDemo7();
		ed1.myData();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
