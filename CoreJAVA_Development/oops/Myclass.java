package Com.evergent.corejava.oops;

public class Myclass extends Calculation {
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass s=new Myclass();
		s.show();
		s.addition();
	}

}
