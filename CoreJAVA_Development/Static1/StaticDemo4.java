package Com.evergent.corejava.Static1;

public class StaticDemo4 {
	static String cname="India";
	String name="Ramesh";
	
	static public void mydata() {
		//show();
		System.out.println("Mydata");
	}
	public void show() {
		mydata();
		System.out.println("non static method"+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mydata();
		System.out.println(cname);
		StaticDemo4 s1= new StaticDemo4();
		s1.show();

	}

}
