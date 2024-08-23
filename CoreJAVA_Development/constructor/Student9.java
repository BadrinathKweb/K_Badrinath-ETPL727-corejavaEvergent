package Com.evergent.corejava.constructor;

public class Student9 {
	String name;
	int age;
	public Student9(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void displaydetails() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 s1= new Student9("bhanu",20);
		Student9 s2=new Student9(s1);
		s1.displaydetails();
		s2.displaydetails();
	}

}
