package Com.evergent.corejava.exceptionhandling;
class InvalidEmployeeId extends Exception{
	public InvalidEmployeeId(String mess) {
		System.out.println("Hello "+mess);
	}
}
public class Sample {
	public void myinfo(String emp) throws InvalidEmployeeId {
		String str1="ETPL";
		if(emp.contains(str1)) {
			System.out.println("Entered id is in format");
		}
		else {
			throw new InvalidEmployeeId("Please enter in the format ETPL[your id]");
		}
	}
	public static void main(String[] args) {
		try {
			Sample s = new Sample();
			s.myinfo("ETPL123");
			//s.myinfo("enp");	
		}
		catch(InvalidEmployeeId e) {
			System.out.println("Exception has been handled");
		}
		finally {
			System.out.println("End");
		}
	}

}
