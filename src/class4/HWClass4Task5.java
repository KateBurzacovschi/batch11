package com.syntax.class4;

import java.util.Scanner;

public class HWClass4Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean creditcard=input.nextBoolean();
		
		if(creditcard==true) {
			System.out.println("Your balance on credit card?");
			double balance=input.nextDouble();
			
			if (balance>1000) {
				System.out.println("Pay off");
			}else {
				System.out.println("You can spend moore");
			}
			}else {
				System.out.println("open a credit card");
			}
			
		}
		
		

	}


