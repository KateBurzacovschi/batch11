package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="shshhHHHHBCCVV3245363&%#@";
		System.out.println(str.replaceAll("[0-5]","*"));
		System.out.println(str.replaceAll("[a-z]","*"));
		System.out.println(str.replaceAll("[A-Za-z]","*"));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]","*"));
	}

}
