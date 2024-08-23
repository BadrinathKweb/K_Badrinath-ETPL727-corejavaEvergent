package Com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default Constructor");
	}
	Employee3(int eno1,String enum1,double sal1){
		eno=eno1;
		ename=enum1;
		sal=sal1;
		
	}
	public void display() {
		System.out.println("Employee No:"+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee sal: "+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee3();
		Employee3 emp= new Employee3(123,"Ravi",55000);
		emp.display();
	}

}
