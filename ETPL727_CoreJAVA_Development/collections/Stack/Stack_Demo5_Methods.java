package Com.evegent.corejava.collections.Stack;
import java.util.Stack;
public class Stack_Demo5_Methods {

	public static void main(String[] args) {
		//creating stack
		Stack <String> s= new Stack<>();
		s.push("Apple");
		s.push("Banana");
		s.push("Cherry");
		s.push("Date");
		
		System.out.println("Stack : "+s);
		
		System.out.println("Top Element: "+s.peek());
		
		System.out.println("Popped element: "+s.pop());
		
		System.out.println("Stack After pop: "+s);
		
		System.out.println("Is the stack Empty? "+s.isEmpty());
		
		int pos = s.search("Banana");
		
		if(pos != -1) {
			System.out.println("Pos of 'Banana' from top is "+pos);
		}
		else {
			System.out.println("Banana is not there in stack");
		}
		s.clear();
		System.out.println("Stack after clearing"+s);
	}

}
