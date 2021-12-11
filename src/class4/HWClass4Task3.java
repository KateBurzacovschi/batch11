package com.syntax.class4;

import java.util.Scanner;

public class HWClass4Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age;
	
		age=18;
		
		Scanner input=new Scanner(System.in);
		System.out.println("How old are you?");
		
		age=input.nextInt();
		if(age>=18) {
			System.out.println("Issue driver license");
		}else {
			System.out.println("Get a learners permit");
		}
	}

}
