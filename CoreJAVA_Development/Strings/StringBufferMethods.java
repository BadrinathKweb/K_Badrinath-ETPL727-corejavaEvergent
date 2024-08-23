package Com.evegent.corejava.Strings;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Before change: "+sb);
		
		//append(): add a string to the end of the current string
		sb.append(" World");
		System.out.println("After append: "+sb);
		
		
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
		
		//capacity() returns the current capacity of the buffer
		//length() returns the current length of the string
		System.out.println("capacity is: "+sb.capacity());
		System.out.println("Length is: "+sb.length());
 	}

}
