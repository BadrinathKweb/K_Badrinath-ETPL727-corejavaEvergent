package Com.evergent.corejava.javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBean stu = new StudentBean();
		stu.setSno(123);
		stu.setSname("Ravi");
		stu.setAddress("Bengaluru");
		System.out.println(stu);

	}

}
