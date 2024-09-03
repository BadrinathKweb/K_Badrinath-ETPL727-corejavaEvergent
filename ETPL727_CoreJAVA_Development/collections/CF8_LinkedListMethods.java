package Com.evegent.corejava.collections;
import java.util.LinkedList;
public class CF8_LinkedListMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a LinkedList of Strings
		LinkedList fruits=new LinkedList();
		//add elements to linkedlist
		fruits.add("apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Kiwi");
		//displaying the linkedlist
		System.out.println("Initial list:"+fruits);
		//Add an element at te begining
		fruits.addLast("Mango");
		System.out.println("after adding element:"+fruits);
		fruits.addLast("Orange");
		System.out.println("after adding last element:"+fruits);
		//access elements by index
		System.out.println("Element at index2:"+fruits.get(2));
		//Remove the first and last elements
		fruits.removeFirst();
		System.out.println("after removing first:"+fruits);
		fruits.removeLast();
		System.out.println("after removing last"+fruits);
		//check if the linkedlist contains a specific element
		System.out.println("Contains Banana?"+fruits.contains("Banana"));
		//Remove an element by value
		fruits.remove("Banana");
		System.out.println("After deletion:"+fruits);
		//get size of the ll
		System.out.println("size of ll:"+fruits.size());
		//clear the ll
		fruits.clear();
		System.out.println(fruits);
	}
}