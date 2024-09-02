package Com.evegent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		int a=10;
		Integer i1= new Integer(a);
		System.out.println(i1);
		int i2=i1.intValue();
		System.out.println(i2);
		
		char ch1='a';
		Character my=ch1;
		char ch=my.charValue();
		System.out.println("value of ch"+ch);
		System.out.println("value of gfg"+my);

	}

}
