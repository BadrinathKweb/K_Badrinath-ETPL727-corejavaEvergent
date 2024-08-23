package Com.evergent.corejava.abstarct1;

public class ProductImpl2 extends Product3 {
	public ProductImpl2() {
		System.out.println("ProductImpl constructer");
	}
	public void newProduct() {
		System.out.println("My New Product");
		
	}
	public void show() {
		System.out.println("Local show method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl2 p1= new ProductImpl2();
		p1.show();
		p1.newProduct();
		
//		Product p2= new ProductImpl2();
//		//p1.show();
//		p2.newproducts();

	}

	

}
