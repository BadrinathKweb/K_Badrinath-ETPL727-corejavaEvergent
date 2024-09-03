package Com.evegent.corejava.collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CF14_Arraylist_Hashset {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Core java");
		list.add("J2EE");
		list.add("J2SE");
		list.add("MyJava");
		System.out.println(list);
		
		Set<String> s=new HashSet<>();
		s.addAll(list);
		System.out.println(s);
		Set<String> s1=new HashSet<>();
		s1.add("Core java");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("MyJava");
		s1.add("Core java");
		System.out.println(s1);
		
		if(s.equals(s1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		System.out.println(s.containsAll(s1));
	}

}
