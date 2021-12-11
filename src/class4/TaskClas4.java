package com.syntax.class4;

public class TaskClas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int age=18;
		double weight=110;
		if(age>=18) {
			System.out.println("You are eligible to donate your blood");
			if(weight>=110) {
				System.out.println("We accept the patient");
			}else {
				System.out.println("we cannot accept the pacient");
				
			}
		}else {
			System.out.println("You are not eligible to donate blood");
		}

	}

}
