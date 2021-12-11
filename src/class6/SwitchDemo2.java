package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter your Country");
		String country=in.next();
		
		String food=null;
		
		switch(country) {
		
		case "Moldova":
			food="Mamaliga";
			break;
		case "Russia":
			food="Olivie";
			break;
			default:
				food="Dont know";
			}
System.out.println("If your country is "+country+" your favorite food is "+food);
	}

}
