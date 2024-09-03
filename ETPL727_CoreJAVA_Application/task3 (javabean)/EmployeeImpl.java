package Com.evegent.corejava.collections.task3;
import java.util.Set;
import java.util.HashSet;
public class EmployeeImpl implements EmployeeInterface {
	Set <Employee> emp = null;
	public EmployeeImpl() {
		emp = new HashSet<Employee>();
	}
	public String addEmployee(Employee e) {
		emp.add(e);
		return e.getId();
	}
	public void searchById(String ID) {
		boolean b=false;
		if(emp.size()>0 && emp!=null) {
			for(Employee em:emp) {
				if(em.getId().equals(ID)) {
					System.out.println("Employee Name: "+em.getName()+" of Experience "+em.getYearsOfExp());
				}
			}
		}
		
	}

	public void searchByName(String name) {
		boolean b=false;
		if(emp.size()>0 && emp!=null) {
			for(Employee em:emp) {
				if(em.getName().equals(name)) {
					System.out.println("Employee Id: "+em.getId()+" of name: "+em.getName()+" of Experience "+em.getYearsOfExp());
				}
			}
		}
		
	}

	public void NoEmployeesByExp(int yearsOfExp) {
		boolean b=false;
		if(emp.size()>0 && emp!=null) {
			for(Employee em:emp) {
				if(em.getYearsOfExp()>(yearsOfExp-1)) {
					System.out.println("Employee Id: "+em.getId()+" of name: "+em.getName()+" of Experience "+em.getYearsOfExp());
				}
			}
		}
		
	}

}
