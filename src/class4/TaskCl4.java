package com.syntax.class4;

public class TaskCl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double rate=4.0;
		double price=100000;
		if(rate>4.5) {
			
			System.out.println("You will not buy a house");
		}else {
			System.out.println("You will buy a house");
			if(price>200000) {
				System.out.println("take a loan");
			}else {
				System.out.println("Pay cash");
			}
		}
		
	}

}
