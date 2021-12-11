package com.syntax.class6;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char gender='m';
		String description;
		
		switch(gender) {
		
		case 'm':
			description="Male";
			break;
		case'f':
			description="Female";
			break;
			default:
				description="Unknown";
			
		}
System.out.println(gender +" means "+description);
	}

}
