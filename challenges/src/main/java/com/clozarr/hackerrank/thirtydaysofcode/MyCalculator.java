package com.clozarr.hackerrank.thirtydaysofcode;


/**
* <p>
* Challenge Day 19: Interfaces
* </p>
* 
* @see <a href= "https://www.hackerrank.com/challenges/30-interfaces/problem">
*      Interfaces</a>
*      
*
* @author clozarr
**/
public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub

		int sum = 0;
		if (n == 1)
			return 1;
		else {

			for (int i = 2; i < n; i++) {

				if (n % i == 0)
					sum += i;
			}

			sum += (1 + n);
		}

		return sum;

	}

}
