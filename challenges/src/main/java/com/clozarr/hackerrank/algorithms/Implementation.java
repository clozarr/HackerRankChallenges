package com.clozarr.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

		// Apples
		int appleSum = 0;
		int appleCount = 0;
		for (int apple : apples) {

			appleSum = apple + a;
			if (appleSum >= s && appleSum <= t)
				appleCount++;
			appleSum = 0;
		}
		// Oranges
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

	/**
	 * <p>
	 * Challenge: Grading Students
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/grading/problem">Grading
	 *      Students </a>
	 * 
	 * @author clozarr
	 **/
	public static List<Integer> gradingStudents(List<Integer> grades) {
		// Write your code here
		int multiple = 0;

		List<Integer> finalGrades = new ArrayList<Integer>();

		for (int grade : grades) {
			multiple = grade;
			if (grade >= 38) {
				while (++multiple % 5 != 0)
					;

				if (multiple - grade < 3)
					finalGrades.add(multiple);
				else
					finalGrades.add(grade);

			} else {
				finalGrades.add(grade);
			}

		}

		return finalGrades;
	}
}
