package Com.evergent.corejava.exceptionhandling;
public class ArrayOfIndex13 {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		try {
			System.out.println("Accesing element at index 10: "+numbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught an exception "+e.getMessage());
			
		}
		System.out.println("Program continues after exception handling");
	}
}