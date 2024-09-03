package Com.evegent.corejava.collections.Stack;
import java.util.Stack;
public class Stack_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ms= new Stack();
		ms.push("Red");
		ms.push("Black");
		ms.push("White");
		boolean b = ms.isEmpty();
		System.out.println(b);
		System.out.println(ms);
		System.out.println(ms.search("Red"));
		ms.clear();
		 System.out.println(ms.isEmpty());
	}

}
