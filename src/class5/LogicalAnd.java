package com.syntax.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean understandJava=true;
		boolean enjoyJava=false;
		
		if(understandJava && enjoyJava) {
			System.out.println("That is awesome");
		}else {
			System.out.println("Study moore");
			
			Scanner in=new Scanner(System.in);
			System.out.println("please enter any number");
			
			int num=in.nextInt();
			if(num<1) {
				System.out.println("number is o or negative");
			
			}else if (num>1 && num<=10) {
				System.out.println(num+" is small");
				
			}else if(num>=11 && num<=100) {
				
				
		System.out.println(num+" is medium");
			}else if(num>=101 && num<=1000) {
				System.out.println(num+" is large");
			}else if(num>=1001){
				
				System.out.println(num+" is xlarge");
				
				
				
				
				
			}
			
			
		
		
		
		
		}
	}

}
