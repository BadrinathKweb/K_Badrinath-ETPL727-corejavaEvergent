package Com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double sal;
	Employee5(){
		System.out.println("Default Constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal){
		this(eno);
		this.ename=ename;
		this.sal=sal;
		
	}
	public void display() {
		System.out.println("Employee No:"+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee sal: "+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee5();
		Employee5 emp= new Employee5(123,"Ravi",55000);
		emp.display();
	}

}
