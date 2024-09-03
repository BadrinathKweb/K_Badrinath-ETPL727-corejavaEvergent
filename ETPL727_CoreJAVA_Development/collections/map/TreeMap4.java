package Com.evegent.corejava.collections.map;
import java.util.Map;
import java.util.TreeMap;
//Treemap doesn't allow null values
// Entry is an interface and entrySet(), gerKey(),getvalue() are methods
public class TreeMap4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> studentRecords= new TreeMap<>();
		studentRecords.put(102, "Badri");
		studentRecords.put(101, "Sai");
		studentRecords.put(103, "Sridhar");
		studentRecords.put(104, "John");
		System.out.println(studentRecords);
		System.out.println("Studnet records(sorted by ID:");
		for(Map.Entry<Integer, String> entry:studentRecords.entrySet())
		{
			System.out.println("ID:"+ entry.getKey()+" "+"name:"+ entry.getValue());
		}
	}
}