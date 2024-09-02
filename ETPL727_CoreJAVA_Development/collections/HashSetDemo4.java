package Com.evegent.corejava.collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet mylist= new HashSet();
		mylist.add(100);
		mylist.add("hello");
		mylist.add(100);
		System.out.println(mylist);
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
