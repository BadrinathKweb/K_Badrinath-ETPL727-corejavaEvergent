package Com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException
{
	public InvalidScoreException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo12 {
	public static void validScore(int score) throws InvalidScoreException
	{
		
		if(score<0||score>100)
		{
			throw new InvalidScoreException("Score must be b/w 0 and 100");
		}
		else
		{
			System.out.println("score is valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validScore(110);
		}
		catch(InvalidScoreException e)
		{
			System.out.println("Caught the exception:"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program  continues after handling the exception");
	}
}