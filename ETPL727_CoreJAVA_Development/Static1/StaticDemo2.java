package Com.evergent.corejava.Static1;

public class StaticDemo2 {
	static String cname="India";
	String name="Ramesh";
	
	static void mydata() {
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
