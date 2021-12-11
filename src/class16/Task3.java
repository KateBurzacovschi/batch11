package com.syntax.class16;

public class Task3 {
	
	private static String processString(String str) {
		return str.replaceAll("[^aeiouAEIOU]","");
		
	}
	public static void main(String[]kk) {
		System.out.println(processString("Ashgar"));
	}

}
