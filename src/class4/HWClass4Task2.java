package com.syntax.class4;

import java.util.Scanner;

public class HWClass4Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loan;
		int money;
		
		loan=300000;
		money=200000;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("What  amount of loan is needed?");
		
		 loan=input.nextInt();
		 
		 if (loan<=money) {
			 System.out.println("Lend the money");
			 
			 money=input.nextInt();
		 }else {
			 System.out.println("Reject the client");
			 
			 money=input.nextInt();
			 
		 }

	}

}
