package com.syntax.class15;

public class dog {

	String name;//instance variable
	String color;//instance variable
	static int noOfLegs;
	void sleep() {
		int time=3;//local variable
		System.out.println(name+" is sleeping");
	}
	void eat() {
		System.out.println(name+" can eat");
	}
}
