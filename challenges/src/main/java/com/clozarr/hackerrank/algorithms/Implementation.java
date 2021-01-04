package com.clozarr.hackerrank.algorithms;

public class Implementation {

	/**
	 * <p>
	 * Challenge: Apple and Orange
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/apple-and-orange/problem">Apple
	 *      and Orange </a>
	 * 
	 * @author clozarr
	 **/
	public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		//Apples
		int appleSum = 0;
		int appleCount = 0;
		for (int apple : apples) {

			appleSum = apple + a;
			if (appleSum >= s && appleSum <= t)
				appleCount++;
			appleSum = 0;
		}
		//Oranges
		int orangeSum = 0;
		int orangeCount = 0;
		for (int orange : oranges) {
			orangeSum = orange + b;
			if (orangeSum >= s && orangeSum <= t)
				orangeCount++;
			orangeSum = 0;
		}
		System.out.println(appleCount + "\n" + orangeCount);

	}
}
