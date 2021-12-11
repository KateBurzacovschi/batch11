package com.syntax.class11;

public class Car {
	String make;
	String model;
	String color;
	int year;
	double milage;
	void moveForward() {
		System.out.println("Car can move forward");
		
	}
	public static void main(String[] args) {
		
		Car ayshasCar=new Car();
		ayshasCar.make="Tesla";
		ayshasCar.model="S";
		ayshasCar.color="Black";
		
		
		System.out.println("Ayshas Car is "+ ayshasCar.make);
		System.out.println("Ayshas Car model is  "+ ayshasCar.model);
		System.out.println("Ayshas Car color is "+ ayshasCar.color);
		ayshasCar.moveForward();
	}

}
