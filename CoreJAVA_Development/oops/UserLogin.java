package Com.evergent.corejava.oops;

public class UserLogin {
	public void logindetails() {
		System.out.println("Login detected");
	}
	public void logindetails(String uname,String pin) {
		System.out.println("Username : "+uname);
		System.out.println("password : "+pin);
		
	}
	public void logindetails(String uname,String pin,String captca) {
		System.out.println("Username : "+uname);
		System.out.println("password : "+pin);
		System.out.println("Captcha : "+captca);
	}
	public void logindetails(int mobile,String pin) {
		System.out.println("P.no : "+mobile);
		System.out.println("password : "+pin);
	}
	public void show() {
		System.out.println("Method overloading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin ul= new UserLogin();
		ul.logindetails();
		ul.logindetails("badri", "abc123");
		ul.logindetails("badri", "abc123", "captcha");
		ul.logindetails(8919726, "abc123");
		ul.show();
	}

}
