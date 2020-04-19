package com.clozarr.hackerrank.thirtydaysofcode;

/**
 * <p>
 * Challenge Day 13: Abstract Classes
 * </p>
 * 
 * @see <a href= "https://www.hackerrank.com/challenges/30-abstract-classes/problem">
 *      Abstract Classes</a>
 * @see {@link Book}}
 *      
 * @author clozarr
 **/
class MyBook extends Book{

	int price;
	public MyBook(String title, String author, int price) {
		// TODO Auto-generated constructor stub
		super(title, author);
		this.price = price;
	}
	
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + this.title 
				+ "\nAuthor: " + this.author 
				+ "\nPrice: " + this.price);
		
	}
 
}
