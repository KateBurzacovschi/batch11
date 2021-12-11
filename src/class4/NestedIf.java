package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean vaccine=true;
		 
		int dose=1;
		if(vaccine) {
			
			System.out.println("How many doses have taken?");
			
			if(dose==2) {
				
				System.out.println("When are you taken your 2nd dose?");
				
			}else {
				System.out.println("Youre fully vaccinated");
				
				System.out.println("--------------------------------------");
				
				
				String day="Friday";
				int date=13;
				
				
				if(day.equals("Friday")) {
					System.out.println("I am going to the movies today");
					
					if(date==13) {
						System.out.println("I am watching a scary movie");
					}
					
				}else {
					
					System.out.println("I am going to study");
					
					
				
					
					
					
				}
				
				
	
			}
		}
	}

}
