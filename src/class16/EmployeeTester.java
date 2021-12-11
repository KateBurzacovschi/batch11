package com.syntax.class16;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.empID="123";
		employee.salary=10000;
		
		Employee employee2= new Employee();
		employee2.empID="456";
		employee2.salary=120000;
System.out.println(employee.empID);
System.out.println(employee.salary);
System.out.println(employee2.empID);
System.out.println(employee2.salary);
System.out.println(Employee.CEO);
	}

}
