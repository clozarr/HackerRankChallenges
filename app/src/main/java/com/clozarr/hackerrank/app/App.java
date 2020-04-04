package com.clozarr.hackerrank.app;

import com.clozarr.hackerrank.algorithms.Warmup;
import com.clozarr.hackerrank.interview.ArraysChallenges;

/**
 * Hello world!
 *
 */
public class App {
	

	public static void main(String[] args) {

		int [] arr = {-4, 3, -9, 0, 4, 1 };
	    Warmup.plusMinus(arr);

		
		 int queries[][] = {{2,6,8},{3,5,7},{1,8,1},{5,9,15}};
		 int sizeOutputArray = 10;

		long v = ArraysChallenges.arrayManipulation(sizeOutputArray, queries);
	    System.out.println("Max: " + v);

		
	}
}
