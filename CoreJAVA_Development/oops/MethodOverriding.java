package Com.evergent.corejava.oops;
class MyBigdata{
	public void mydata() {
		System.out.println("MyBigData : ClassMethod");
	}
}
public class MethodOverriding extends MyBigdata {
	public void mydata() {
		System.out.println("MyData");
	}
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mo = new MethodOverriding();
		mo.mydata();
		mo.show();
	}

}
