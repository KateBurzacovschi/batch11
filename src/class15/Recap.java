package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is Lubo.Lubo is break manager.";
		System.out.println(str.replace("Lubo","Dima"));
		
		
		String str2="jjdhcbcbc1234$%$#";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(str2.replace("[^A-Za-z0-9]",""));
		
		StringBuilder stringBuilder =new StringBuilder();
		
		for(int i=0;i<5;i++) {
			stringBuilder.append(i);
		}
System.out.println(stringBuilder);
	}

}
