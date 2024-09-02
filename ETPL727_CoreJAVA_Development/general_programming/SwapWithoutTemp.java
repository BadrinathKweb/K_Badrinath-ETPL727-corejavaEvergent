package Com.evergent.corejava.general_programming;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=15;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
