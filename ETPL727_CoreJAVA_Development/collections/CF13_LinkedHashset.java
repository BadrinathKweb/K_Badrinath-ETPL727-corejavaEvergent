package Com.evegent.corejava.collections;
import java.util.LinkedHashSet;
public class CF13_LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Apple");
		lhs.add("Banana");
		lhs.add("Orange");
		lhs.add("Mango");
		lhs.add("Grapes");
		
		//display LinkedHashSet
		System.out.println("LinkedHashSet: "+lhs);
		
		//Iterating through LinkedHashSet
		System.out.println("Iterating over LinkedHashSet");
		for(String frouit:lhs) {
			System.out.println(frouit);
		}
		
		//check if set contains an element : return true if contains
		System.out.println("Contains 'manngo':"+lhs.contains("Mango"));
		
		//Remove an element
		lhs.remove("Banana");
		System.out.println("After removing banana: "+lhs);
		
		//check size
		System.out.println("Size of LinkedHashSet"+lhs.size());
		
		//clearing the LinkedHashSet
		lhs.clear();
		System.out.println("After clearing: "+lhs);
	}
}