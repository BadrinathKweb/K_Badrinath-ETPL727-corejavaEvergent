package Com.evergent.corejava.Static1;

public class StaticDemo3 {
	static String cname="India";
	String name="Ramesh";
	
	static public void mydata() {
		//show();
		System.out.println("Mydata");
	}
	public void show() {
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mydata();
		System.out.println(cname);

	}

}
