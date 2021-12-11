package com.syntax.class17;

public class Book {
	
String Author;
	String bookshop;
	
	
	public Book(String Author) {
		this.Author=Author;
		System.out.println("The book Author is "+Author);
	}
	public Book(String Author,String bookshop) {
		this(Author);
		this.bookshop=bookshop;
		
		System.out.println("This book can be found in the "+bookshop+"bookshop");
	}
	 
	
}
