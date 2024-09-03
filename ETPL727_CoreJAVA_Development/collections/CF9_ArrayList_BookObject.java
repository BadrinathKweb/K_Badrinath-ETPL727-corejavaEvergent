package Com.evegent.corejava.collections;
import java.util.ArrayList;
class Book5
{
	String name;
	public Book5(String name) {
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
}
public class CF9_ArrayList_BookObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book5 b1=new Book5("Core Java");
		Book5 b2=new Book5("Let us c");
		Book5 b3=new Book5("Java index Book");
		Book5 b4=new Book5("Java interview book");
		ArrayList mylist=new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		mylist.add(b4);
		System.out.println(mylist);
	}
}