package Com.evergent.corejava.general_programming;
class myperson{
	public void personinfo() {
		System.out.println("Badrinath");
	}
}
class persondetails extends myperson{
	public void persondetails1() {
		System.out.println("Hyderabad");
	}
	
}
public class Sample extends persondetails{
	public void show() {
		System.out.println("here is person details");
	}

public static void main(String [] args){

Sample s1 = new Sample();
s1.personinfo();
s1.persondetails1();
s1.show();

}

}