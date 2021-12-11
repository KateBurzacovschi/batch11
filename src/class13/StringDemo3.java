package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String name="This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("Lemon"));
		System.out.println(name.contains("i"));
		
		
		
		String str2 ="hello";
		String str3="hello";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		
		System.out.println(str2.charAt(0));
	System.out.println(name.substring(10));
	}

}
