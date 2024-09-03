package Com.evergent.corejava.studentapplication;
public class StudentService {
	                           //100      corejava    250
	public int addStudentService(int studentId,String name,int marks)
	{  String grade="";
	
	   if(marks<=300)
	   {
		   grade = "C";
	   }
	   else if(marks<=600)
	   {
		   grade = "B";
		   
	   }
	   else
	   {
		   grade = "A";
	   }
		
		
		StudentDAO studentDAO = new StudentDAO();
		StudentBean studentBean=new StudentBean();
	       studentBean.setStudentId(studentId);	
	       studentBean.setName(name);
	       studentBean.setMarks(marks);
	       studentBean.setGrade(grade);
	
		   int updateResult= studentDAO.addStudent(studentBean);
		
		return 1;
	} 
}
