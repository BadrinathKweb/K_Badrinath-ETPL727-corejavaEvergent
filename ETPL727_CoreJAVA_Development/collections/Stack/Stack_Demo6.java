package Com.evegent.corejava.collections.Stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
public class Stack_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> ms= new Stack<>();
		ms.push("Red");
		ms.push("Black");
		ms.push("White");
		boolean b = ms.isEmpty();
		System.out.println(b);
		System.out.println(ms);
		System.out.println("Enumeration Iteration");
		Enumeration e = ms.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("Iterator Iteration");
		Iterator i = ms.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("For each Iteration");
		for(String s:ms) {
			System.out.println(s);
		}
	}

}
