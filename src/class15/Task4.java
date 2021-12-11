package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is sentence i want to reverse";
String[] strArr=str.split(" ");
for(String word:strArr) {
	StringBuilder stringBuilder=new StringBuilder(word);
	System.out.print(stringBuilder.reverse()+" ");
}
	}

}
