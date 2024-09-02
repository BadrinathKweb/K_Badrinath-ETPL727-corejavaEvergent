package Com.evergent.corejava.oops;

public class MethodFlow {
	//no parameters with no return type
	public void show() {
		System.out.println("no parameters with no return type");
	}
	//parameters with no return type
	public void mydata(int a, int b) {
		System.out.println(a+b);
	}
	//parameters with return type
	public int mymul(int a, int b) {
		return a*b;
	}
	//no parameters with return type
	public int mychange() {
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow m1=new MethodFlow();
		m1.show();
		m1.mydata(10, 20);
		System.out.println(m1.mymul(10, 20));
		System.out.println(m1.mychange());
	}

}
