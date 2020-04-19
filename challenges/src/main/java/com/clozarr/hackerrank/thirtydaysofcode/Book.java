package com.clozarr.hackerrank.thirtydaysofcode;

/**
 * <p>
 * Challenge Day 13: Abstract Classes
 * </p>
 * 
 * @see <a href= "https://www.hackerrank.com/challenges/30-abstract-classes/problem">
 *      Abstract Classes</a>
 *      
 * @author clozarr
 **/
abstract class Book {

	String title;
	String author;

	Book(String title, String author) {

		this.title = title;
		this.author = author;
	}

	abstract void display();
}
