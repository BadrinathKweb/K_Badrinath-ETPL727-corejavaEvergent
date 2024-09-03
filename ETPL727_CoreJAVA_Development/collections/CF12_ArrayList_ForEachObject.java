package Com.evegent.corejava.collections;
import java.util.ArrayList;
public class CF12_ArrayList_ForEachObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> mylist=new ArrayList<>();
		mylist.add(100);
		mylist.add("hello");
		mylist.add("Badri");
		mylist.add(21.3);
		mylist.add(22);
		for(Object k : mylist)
		{
			System.out.println(k);
		}
	}
}