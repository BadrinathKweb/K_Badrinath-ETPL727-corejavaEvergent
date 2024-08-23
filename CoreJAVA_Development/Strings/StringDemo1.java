package Com.evegent.corejava.Strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("Hello");
		String str2=new String("Hello");
		if(str1==str2) 
			System.out.println("True");
		else
			System.out.println("False");
		
		if(str1.equals(str2)) 
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
