package com.syntax.class10;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] groceries= {
				{"banana","apple","mango"},
				{"potato","tomato"},
				{"milk","cheese","ayran","yogurt"}
		};
		System.out.println(groceries.length);
		System.out.println(groceries[2][3]);
		
		System.out.println("num of element inside array with index 0="+groceries[0].length);
		System.out.println("num of element inside array with index 1="+groceries[1].length);
		System.out.println("num of element inside array with index 2="+groceries[2].length);
		
		for(int i=0;i<groceries.length;i++) {
			for(int j=0;j<groceries[i].length;j++) {
				System.out.println(groceries[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
