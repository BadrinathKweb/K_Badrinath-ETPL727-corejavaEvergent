package Com.evegent.corejava.wrapperclasses;
import java.util.ArrayList;
public class WrapperClassesDemo4_Array {

	public static void main(String[] args) {
		int a=100;
		Integer i1=new Integer(a);
		ArrayList mylist =new ArrayList();
		mylist.add(i1);
		System.out.println(mylist);
		Integer i2 = new Integer(200);
		mylist.add(i2);
		System.out.println(mylist);
		mylist.add(new Integer(45));
		System.out.println(mylist);

	}

}
