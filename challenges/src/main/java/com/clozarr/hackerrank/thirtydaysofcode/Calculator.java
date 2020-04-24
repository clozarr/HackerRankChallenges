package com.clozarr.hackerrank.thirtydaysofcode;


/**
* <p>
* Challenge Day 17: More Exceptions
* </p>
* 
* @see <a href= "https://www.hackerrank.com/challenges/30-more-exceptions/problem">
*      More Exceptions</a>
*      
*
* @author clozarr
**/
class Calculator {

	public int power(int n, int p) throws Exception {

		if (n >= 0 && p >= 0)
			return (int) Math.pow(n, p);
		else
			throw new Exception("n and p should be non-negative");
	}

}
