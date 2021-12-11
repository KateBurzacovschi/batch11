package com.syntax.class16;

public class DogTester {

	public static void main(String[] args) {
		
		Dog.DisplayLegs();
		Dog dog1= new Dog();
		dog1.name="Casper";
		dog1.displayName();
		
		Dog dog2= new Dog();
		dog2.name="Bobik";
		dog2.displayName();
		
		Dog dog3= new Dog();
		dog3.name="Bob";
		dog3.displayName();

	}

}
