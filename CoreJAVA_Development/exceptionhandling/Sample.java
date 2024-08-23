package Com.evergent.corejava.exceptionhandling;

public class Sample {
	public void myinfo() {
		try {
			int k=2/0;
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		finally {
		System.out.println("hh");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s= new Sample();
		s.myinfo();
	}

}
