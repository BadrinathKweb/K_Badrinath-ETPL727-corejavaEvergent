package Com.evergent.corejava.javabeans;

public class EmployeeImp {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEno(100);
		emp.setEname("Raju");
		emp.setSal(55000);
		System.out.println("employee id "+emp.getEno());
		System.out.println("Employee name "+emp.getEname());
		System.out.println("Employee sal "+emp.getSal());

	}

}
