package Com.evergent.corejava.objectclassmethods;
class person1{
	String name;
	int age;
	public person1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String tostring() {
		return name+" "+age;
	}
}
public class PersonData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 p = new person1("Bhanu",25);
		System.out.println(p);
	}

}
