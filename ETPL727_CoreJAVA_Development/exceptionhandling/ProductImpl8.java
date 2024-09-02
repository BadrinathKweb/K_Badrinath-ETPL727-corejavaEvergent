package Com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello "+message);
	}
}
public class ProductImpl8 {
	int pno=105;
	public void mydata() throws ProductNotFoundException{
		if(pno >100) {
			throw new ProductNotFoundException("This product no there");
		}
		else {
			System.out.println("Product is there");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		ProductImpl8 pl = new ProductImpl8();
		pl.mydata();
		}
		catch(Exception e) {
			System.out.println("I Can Handle: "+e);
		}
		
	}

}
