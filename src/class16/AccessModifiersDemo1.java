package com.syntax.class16;

public class AccessModifiersDemo1 {

	
		 String name;
		int age;
		public double salary;
		
		void displayName() {
			System.out.println(name);
			
		}
		void displayAge() {
			System.out.println(age);
			
		}
		void displaySalary() {
		System.out.println(salary);
		
	
		}
		public static void main (String[]kk) {
			AccessModifiersDemo1 am=new AccessModifiersDemo1();
			am.name="Kate";
			am.age=22;
			am.salary=1111;
			am.displayAge();
			am.displayName();
			am.displaySalary();
			
		}
	}


