package com.syntax.class16;

public class StudentTester {

	public static void main(String[] args) {
		Student student=new Student();
		student.Name="Sebi";
		student.Id="123";
		Student.numberOfStudents++;
		
		Student student1=new Student();
		student1.Name="Seb";
		student1.Id="234";
		Student.numberOfStudents++;

		Student student2=new Student();
		student2.Name="Sebo";
		student2.Id="123344";
		Student.numberOfStudents++;

System.out.println(Student.numberOfStudents);
	}

}
