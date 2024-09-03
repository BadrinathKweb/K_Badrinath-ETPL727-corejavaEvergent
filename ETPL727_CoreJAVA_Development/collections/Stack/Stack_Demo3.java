package Com.evegent.corejava.collections.Stack;
import java.util.Stack;
public class Stack_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ms= new Stack();
		ms.push("Red");
		ms.push("Black");
		ms.push("White");
		System.out.println(ms);
		System.out.println(ms.search("Red"));
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}

}
