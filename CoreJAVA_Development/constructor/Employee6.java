package Com.evergent.corejava.constructor;
class MyEmployee{
	int eno;
	public MyEmployee(){
		
	}
	MyEmployee(int eno){
		System.out.println("Employee no super class: "+eno);
	}
}
public class Employee6 extends MyEmployee{
	int eno;
	String ename;
	double sal;
	Employee6(){
		System.out.println("Default Constructor");
	}
	Employee6(int eno,String ename,double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee sal: "+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee6 em= new Employee6(123,"Ravi",55000);
		em.display();
	}

}
