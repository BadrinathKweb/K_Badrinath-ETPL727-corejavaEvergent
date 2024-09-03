package Com.evegent.corejava.collections.map;
import java.util.HashMap;
//Keys cannot be duplicate, keys should be unique
//HashMap only takes one null key, but multiple null values
public class HashMapDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mymap=new HashMap();
		mymap.put(100,"Vinay");
		mymap.put(200,"Dhruti");
		mymap.put("300","Roshu");
		mymap.put(null,"abc");
		mymap.put(700,null);
		System.out.println(mymap);
	}
}