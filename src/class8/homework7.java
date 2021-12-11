package com.syntax.class8;

import java.util.Scanner;

public class homework7 {
	public static void main(String[]aa) {
 
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);

		String item;
		double price;
		double money;
		double reminder;
		double sum=0;
		
		System.out.println("What yuo want to buy?");
		item=in.next();
		System.out.println("Please enter price");
		price=in.nextDouble();
		
		do {
			System.out.println("Please pay for the "+ item);
			money=in.nextDouble();
			sum+=money;
			
			if (sum>price) {
				
				double change=sum-price;
				
				System.out.println("Here is your change "+ change);
				break;
				
			}else if(sum<price) {
				
				reminder=price-sum;
				System.out.println("Please give me more "+ reminder);
				
				
			}else {
				
				System.out.println("You go the right amount");
			}
			
			
		}while(sum!=price);
		
		System.out.println("Thank you for shopping");
		
		
	}

}
