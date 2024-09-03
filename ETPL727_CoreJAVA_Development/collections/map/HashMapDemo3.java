package Com.evegent.corejava.collections.map;
import java.util.HashMap;
//hashMap doesn't take duplicate elements and values
public class HashMapDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> capitalCities=new HashMap();
		capitalCities.put("India", "Delhi");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("USA", "Washinton DC");
		capitalCities.put("India", "Delhi");
		System.out.println(capitalCities);
		for(String i:capitalCities.keySet())//keySet() returns all the key values
		{
			System.out.println(i);
		}
	}
}