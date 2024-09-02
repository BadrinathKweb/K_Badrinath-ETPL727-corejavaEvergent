package Com.evergent.corejava.final1;
final class Myclass1{
	public void myproducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo3{
	final String cname="India";
	public void myproducts1() {
		System.out.println("Hello Products");
	}
	public void mydata() {
		System.out.println("cname: "+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 fd= new FinalDemo3();
		fd.mydata();
		Myclass1 m1= new Myclass1();
		m1.myproducts();
	}

}
