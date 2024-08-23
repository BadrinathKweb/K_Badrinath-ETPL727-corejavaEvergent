package Com.evergent.corejava.abstarct1;

public class ProductImpl extends Product {
	public void newproducts() {
		System.out.println("My New Product");
		
	}
	public void show() {
		System.out.println("Local show method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl p1= new ProductImpl();
		p1.show();
		p1.newproducts();
		
		Product p2= new ProductImpl();
		//p1.show();
		p2.newproducts();

	}

	

}
