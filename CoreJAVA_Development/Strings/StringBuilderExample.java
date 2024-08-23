package Com.evegent.corejava.Strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//append(): add a string to the end of the current string
		StringBuilder sb= new StringBuilder("Hello");
		System.out.println("Before change: "+sb);
		sb.append(" World");
		
		//insert(): adds a string at a specified position
		sb.insert(6, "Beautiful ");
		System.out.println("After insert: "+sb);
		
		//replace() replace substring with new string
		sb.replace(0, 5, "Hi");
		System.out.println("After replace: "+sb);
				
		//delete() delete the substring 
		sb.delete(2, 12);
		System.out.println(sb);
				
		//reverse() reverse the order of characters
		sb.reverse();
		System.out.println(sb);

	}

}
