package Com.evergent.corejava.exceptionhandling;
class AgeNotSupportException extends Exception{
	public AgeNotSupportException(String message) {
		System.out.println("Hello"+message);
	}
}
public class VotingAge9 {
	int pno=19;
	public void mydata() throws AgeNotSupportException{
		if(pno <19) {
			throw new AgeNotSupportException(" You are not eligible to vote");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			VotingAge9 pl = new VotingAge9();
		pl.mydata();
		}
		catch(Exception e) {
			System.out.println("I Can Handle: "+e);
		}
		
	}

}
