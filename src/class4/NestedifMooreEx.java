package com.syntax.class4;

public class NestedifMooreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean replCompleted=true;
		int assignments=19;
		
		if (replCompleted) {
			System.out.println("Great job");
			
			if(assignments>16) {
				System.out.println("You did an amazing work");
			}else if (assignments>10){
				
				System.out.println("You did good,but you should do moore");
			}
			
		}else {
			System.out.println("Please make sure you do your homework");
		}
		

	}

}
