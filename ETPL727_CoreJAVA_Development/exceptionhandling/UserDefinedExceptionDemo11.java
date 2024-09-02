package Com.evergent.corejava.exceptionhandling;
class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo11 {
	public static void withDraw(double amount) throws InsufficientFundsException
	{
		double balance=500.00;
		if(amount>balance)
		{
			throw new InsufficientFundsException("Insufficient funds for withdrawl");
		}
		else
		{
			System.out.println("withdrawl succesful");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			withDraw(600.00);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Caught the exception:"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program  continues after handling the exception");
	}
}