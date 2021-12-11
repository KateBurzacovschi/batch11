package com.syntax.class13;

public class HWTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName="Ispring";
		String password="abc1234";
		System.out.println(userName.isEmpty());
		System.out.println(password.isEmpty());
		
		
		System.out.println(password.length());
		if(password.length()<8) {
			System.out.println("Password is too short");
			
		if(password.contains(userName)) {
		System.out.println("Password cannot contain username");
	}else {
		System.out.println("Password do not match");
		
		
		}
			System.out.println("You have created your username and password");
		}
		
	}
}


