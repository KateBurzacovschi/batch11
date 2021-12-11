package com.syntax.class5;

import java.util.Scanner;

public class LogicalTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("first number");
		
		int number1=input.nextInt();{
			System.out.println("second number");
			int number2=input.nextInt();{
				System.out.println("third number");
				int number3=input.nextInt();{
					
					if(number1>=number2&& number1>number3) {
						System.out.println("its the larger number");
					}else if(number2>number1 && number2>number3) {
						System.out.println("its a larger number");
					}else {
						if(number3>=number1 && number3>=number2) {
							System.out.println("its a larger number");
				
						}
					}
				}
			}
		}
		
	
	}

}
