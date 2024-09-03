package Com.evegent.corejava.collections;
import java.util.HashSet;
import java.util.Iterator;
public class CF11_HashSet_Generics {
	    public static void main(String[] args) {
	        // Create a HashSet of Strings
	        HashSet<String> myset = new HashSet<>();
	        myset.add("Dhruti");
	        myset.add("Roshu");
	        myset.add("hasikha");
	        myset.add("hari");
	       
	        // Print the HashSet
	        System.out.println(myset);
	       
	        // Create an Iterator for the HashSet
	        Iterator<String> i = myset.iterator();
	       
	        // Iterate through the HashSet and print each element
	        while (i.hasNext()) {
	            System.out.println(i.next());
	            
	           
	        }
	        for(String s:myset) {
	        	System.out.println(s);
	        }
	    }
	}