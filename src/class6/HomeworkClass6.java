package com.syntax.class6;

import java.util.Scanner;

public class HomeworkClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("please enter your first number");
		double x=in.nextDouble();
		
		String operator=in.next();
		System.out.println("please enter your second number");
		double z=in.nextDouble();
		double answer=0.0;
		if (operator.equals("+")) {
			answer=x+z;

	}else if(operator.equals("-")) {
		answer=x-z ;
		
	}else if(operator.equals("*")) {
		answer=x*z;
		
		
	}else {
		answer=x/z;
	}
System.out.println("The result is "+answer);
	}
}


