package com.syntax.class6;

import java.util.Scanner;

public class HomeworkClass6Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter first number");
		double n1=in.nextDouble();
		System.out.println("enter second number");
		double n2=in.nextDouble();
		String operator=in.next();
		double result=0.0;
		switch (operator) {
		case "+":
		result=n1+n2;
		break;
		case"-":
			result=n1-n2;	
			break;
		case"*":
			result=n1*n2;
			break;
		case"/":
			result=n1/n2;
			break;
			
		}
	System.out.println("The result is "+result);	
		
		

	}

}
