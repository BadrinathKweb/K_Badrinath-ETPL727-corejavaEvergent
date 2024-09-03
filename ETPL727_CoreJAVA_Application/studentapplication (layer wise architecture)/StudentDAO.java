package Com.evergent.corejava.studentapplication;

import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	public int addStudent(StudentBean studentBean)
	{
		try{
			ArrayList studentList=new ArrayList();
			studentList.add(studentBean.getStudentId());
			studentList.add(studentBean.getName());
			studentList.add(studentBean.getMarks());
			studentList.add(studentBean.getGrade());	
			
			System.out.println(studentList);
			
			System.out.println("Book ID :"+studentBean.getStudentId());
			System.out.println("Book Title :"+studentBean.getName());
			System.out.println("Book Price :"+studentBean.getMarks());
			System.out.println("Book Grade :"+studentBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
