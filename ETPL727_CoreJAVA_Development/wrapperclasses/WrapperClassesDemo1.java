package Com.evegent.corejava.wrapperclasses;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
		int a=10;
		Integer i1= new Integer(a);
		int i2=i1.intValue();
		
		
		double d1=10.88;
		Double d2= new Double(d1);
		double d3=d2.doubleValue();
		
		byte b1=10;
		Byte b2= new Byte(b1);
		byte b3=b2.byteValue();
		
		System.out.println("Int value: "+a);
		System.out.println("Int object value: "+i1);
		System.out.println("convert Integer object to int: "+i2);
		
		System.out.println("Double value: "+d1);
		System.out.println("Double object value: "+d2);
		System.out.println("convert Double object to double: "+d3);
		
		System.out.println("Byte value: "+b1);
		System.out.println("Byte object value: "+b2);
		System.out.println("convert Byte object to byte: "+b3);
		

	}

}
