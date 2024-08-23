package Com.evergent.corejava.exceptionhandling;
public class StackOverflowErrorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			recursiveMethod();
		}
		catch(StackOverflowError e)
		{
			System.out.println("StackOverflow errror caught:"+e.getMessage());
		}
	}
	//recursive method with no base case
	public static void recursiveMethod()
	{
		recursiveMethod();// the method keeps calling itself
	}
}






