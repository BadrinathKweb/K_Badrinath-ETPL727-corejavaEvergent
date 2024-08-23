package Com.evergent.corejava.general_programming;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("now ready to perform addtion");
		System.out.print("Enter number 1:");
		int num1=sc.nextInt();
		System.out.print("Enter number 2:");
		int num2=sc.nextInt();
		System.out.println("Here is the addition master "+name+": "+(num1+num2));
		
				
	}

}
