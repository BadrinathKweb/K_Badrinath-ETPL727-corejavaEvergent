package Com.evergent.corejava.oops;
class Animal{
	private String name;
	private int age;
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public void displayinfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		
	}
}

public class Sample extends Animal{
	private String breed;
	public Sample(String name, int age,String breed) {
		super(name, age);
		this.breed=breed;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Breed: "+breed);
	}
	
	public static void main(String[] args) {
		Sample n= new Sample("dog",10,"golden retrevier");
		n.displayinfo();
	}
	
}