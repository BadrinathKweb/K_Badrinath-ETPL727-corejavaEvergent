package Com.evegent.corejava.collections.task3;

public interface EmployeeInterface {
	String addEmployee(Employee e);
	void searchById(String ID);
	void searchByName(String name);
	void NoEmployeesByExp(int yearsOfExp);
}
