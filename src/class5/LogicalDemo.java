package com.syntax.class5;

import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter today's day");
		String day=scan.next();
		
		if(day.equals("monday") || day.equals("friday")) {
			System.out.println("No class");
			
		}else if(day.equals("tuesday") || day.equals("wednesday")) {
			System.out.println("We have manual class today");{
			}
			}else if(day.equals("saturday") || day.equals("sunday")) {
				System.out.println("we have java class");
				
			}else if(day.equals("thursday")) {
				System.out.println("we have a review class");
				
			}else {
				System.out.println("wrong input");
			}
	}
}
	

	


