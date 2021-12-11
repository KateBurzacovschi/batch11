package com.syntax.class7;

import java.util.Scanner;

public class DoLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int secretNumber=78;
		Scanner in=new Scanner(System.in);
		int userNumber=in.nextInt()	;
		do {
			System.out.println("please guess my secret number");
			userNumber=in.nextInt()	;
			
			
		}while(userNumber!=secretNumber);
		System.out.println("you got it");

	}

}
