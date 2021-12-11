package com.syntax.class6;

import java.util.Scanner;

public class task2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade=in.next();
		String explanation;
		
		switch(grade) {
		
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
			default:
				explanation="Unknown grade";
		}
		System.out.println("Your grade is "+grade+" you are doing "+explanation);	
			
			
			
			
			
		

	}

}
