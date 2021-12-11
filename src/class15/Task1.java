package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My birthday is near";
		System.out.println(str.replaceAll(" ", ""));
		str=str.replaceAll("\\s","");
		System.out.println(str);
		StringBuilder str2=new StringBuilder("My birthday is near");
		System.out.println(str2.reverse());
		System.out.println(str2);
	}

}
