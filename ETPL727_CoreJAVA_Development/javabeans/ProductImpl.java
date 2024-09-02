package Com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		ProductBean p= new ProductBean(100,"laptop",55000);
		System.out.println("Product no "+p.getPno());
		System.out.println("Product name "+p.getPname());
		System.out.println("Product price "+p.getPrice());
		

	}

}
