package Com.evergent.corejava.final1;
class Myclass{
	final public void myproducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends Myclass{
	final String cname="India";
	public void myproducts1() {
		System.out.println("Hello Products");
	}
	public void mydata() {
		System.out.println("cname: "+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 fd= new FinalDemo2();
		fd.mydata();
		fd.myproducts();
	}

}
