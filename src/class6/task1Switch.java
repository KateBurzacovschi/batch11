package com.syntax.class6;

import java.util.Scanner;

public class task1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		String country=in.next();
		String Language=null;
		
		switch (country) {
		case "Moldova":
			Language="Romanian";
			break;
		case "Russia":
			Language="Russian";
			break;
			default:
				Language="Invalid language";
				
		}
		System.out.println("If your country is "+ country+" you speak "+Language);
	}

}
