package com.syntax.class17;

public class Task2 {
	String name;
	double sub1;
	double sub2;
	double sub3;
	public Task2(String name, double sub1, double sub2, double sub3) {
	
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public void printAvgGrade() {
		System.out.println((sub1+sub2+sub3)/3);
	}

}
