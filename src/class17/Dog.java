package com.syntax.class17;

public class Dog {

	private String name;
	private  String color;
	private String breed;
	private int age;
	
	public Dog (String dogName,String dogColor,String dogBreed,int dogAge) {
		System.out.println("Dogs constructor is called");
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		
	}
public void printName() {
	System.out.println(name);
}
}
