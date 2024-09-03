package Com.evegent.corejava.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class CF6_ListIterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();
		list.add("Dhruti");
		list.add("Vinay");
		list.add("Roshu");
		list.add("Hari");
		ListIterator li=list.listIterator();
		li.add("Welcome");
		while(li.hasNext())
		{
			String s= (String) li.next();
			System.out.println(s);
			if(s.equals("Roshu"))
				li.remove();
			}
		while(li.hasPrevious())
			System.out.println(li.previous());
	}
}