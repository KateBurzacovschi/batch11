package com.syntax.class7;

import java.util.Scanner;

public class TaskLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int i=5;
		while(i>=1) {
		System.out.println("enter yor name and age");
		 
		String name= scan.next();
		int age=scan.nextInt();
		System.out.println("you name is "+ name+" and you are "+ age+" years old");
		i--;
		

	}

	}
}
