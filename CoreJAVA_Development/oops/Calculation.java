package Com.evergent.corejava.oops;

public class Calculation {
	int a=10;  //attributes
	int b=20;
	int c;
	
	public void addition() {
		c=a+b;
		System.out.println(c);
	}
	public void subtraction() {
		c=a-b;
		System.out.println(c);
	}
	public void multiplication() {
		c=a*b;
		System.out.println(c);
	}
	public void division() {
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();

	}

}
