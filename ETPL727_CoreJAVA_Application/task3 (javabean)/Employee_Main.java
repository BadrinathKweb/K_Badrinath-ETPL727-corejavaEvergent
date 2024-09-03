package Com.evegent.corejava.collections.task3;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Employee_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeInterface emp=new EmployeeImpl();
		for(;;){
			System.out.println("1.Add Employee");
			System.out.println("2.Search Employee By Id");
			System.out.println("3.Search Employee By Name");
			System.out.println("4.Search employees by years of Experience");
			System.out.println("5.Exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the Id");
				   String id=sc.next();
				   System.out.println("Enter the Employee name");
				   String name=sc.next();
				   System.out.println("Enter Years of Experience");
				   int yOE=sc.nextInt();
				   Employee b=new Employee();
				   b.setId(id);
				   b.setName(name);
				   b.setYearsOfExp(yOE);
				   String message=emp.addEmployee(b);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the ID");
			   	   String id1=sc.next();
			   	   emp.searchById(id1);
			   	   break;
			case 3:System.out.println("Enter the Name");
		   	   String nam=sc.next();
		   	   emp.searchByName(nam);
		   	   break;
			case 4:System.out.println("Enter the Employee years of Experience required");
		   	   int n=sc.nextInt();
		   	   emp.NoEmployeesByExp(n);
		   	   break;
			
			case 5:System.exit(0);
			}
			
		}
	}
}
	
