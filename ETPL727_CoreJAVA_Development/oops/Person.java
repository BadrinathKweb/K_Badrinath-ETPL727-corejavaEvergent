package Com.evergent.corejava.oops;

public class Person {
	String name="Badrinath";
	int age=22;
	String address="Hyderabad";
	
	
	public void display() {
		System.out.println(name+" of age: "+age+" of address "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.display();

	}

}
