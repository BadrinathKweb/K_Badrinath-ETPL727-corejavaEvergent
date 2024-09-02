package Com.evegent.corejava.collections;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo5 {

	public static void main(String[] args) {
		TreeSet mylist= new TreeSet();
		mylist.add(100);
		mylist.add(200);
		mylist.add(100);
		System.out.println(mylist);
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
