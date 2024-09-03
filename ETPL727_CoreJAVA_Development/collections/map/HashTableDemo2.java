package Com.evegent.corejava.collections.map;
import java.util.Hashtable;
public class HashTableDemo2 {
//hashtable doest take null values it raises null pointer Exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable mytable=new Hashtable();
		mytable.put(100,"Badri");
		mytable.put(200,"Sridhar");
		mytable.put("300","Saikiran");
		//mytable.put(null,"abc");
		//mytable.put(700,null);
		System.out.println(mytable);
	}
}