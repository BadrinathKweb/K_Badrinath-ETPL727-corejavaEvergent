package Com.evergent.corejava.constructor;
class Animal{
	private String name;
	private int age;
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
	}
}
class Dog extends Animal{
	String breed;
	public Dog(String name,int age,String bread) {
		super(name,age);
		this.breed=bread;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Bread: "+breed);
	}
}
public class Inheritence_overloading {
	public static void main(String[] args) {
		Dog dog= new Dog("buddy",5,"Golden Retrieve");
		dog.displayInfo();
	}
}
