package Com.evergent.corejava.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("Default Constructor");
	}
	Employee2(int eno,String ename,double sal){
		this.eno=eno;
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
		new Employee2();
		Employee2 emp= new Employee2(123,"Ravi",55000);
		emp.display();
	}

}
