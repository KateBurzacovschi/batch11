package com.syntax.class4;

import java.util.Scanner;

public class HWClass4Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int nr1;
		int nr2;
		
		
		 nr1=10;
		 nr2=30;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What number is larger?");
		
	nr1= scan.nextInt();
		
	
		if(nr1>nr2) {
			System.out.println("The largest number is "+ nr1);
			nr2=scan.nextInt();
			
		}else {
			System.out.println("The largest number is "+ nr2);
		}nr2=scan.nextInt();
		}
		
		
	}


