package com.syntax.class5;

import java.util.Scanner;

public class LogicalTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int day=input.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("weekday");
		}else if(day==6 && day==7) {
			System.out.println("weekend");
		}else {
			System.out.println("invalid day");
		}
		
		}

	}


