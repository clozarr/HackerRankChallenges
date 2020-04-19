package com.clozarr.hackerrank.algorithms;
import java.util.LinkedList;
import java.util.List;



/**
 * 
 **/
public class Warmup {

	/**
	 * <p>
	 * Challenge: Solve me first
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/solve-me-first/problem">Solve Me First</a>
	 * @author clozarr
	 **/
	public static int solveMeFirst(int a, int b) {
      	// Hint: Type return a+b; below 
      return a + b;
   }
	
	/**
	 * <p>
	 * Challenge: Simple Array Sum
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/simple-array-sum/problem">Simple
	 *      Array Sum</a>
	 * @author clozarr
	 **/
	public static int simpleArraySum(int[] ar) {

		int sum = 0;
		for (int element : ar) {

			sum += element;
		}
		return sum;
	}

	/**
	 * <p>
	 * Challenge: Compare the Triplets
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/compare-the-triplets/problem">Compare
	 *      the Triplets</a>
	 * @author clozarr
	 **/
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int bobScore = 0;
		int aliceScore = 0;

		if (a.size() == b.size()) {

			for (int i = 0; i < a.size(); i++) {

				if (a.get(i).intValue() > b.get(i).intValue()) {

					aliceScore++;

				} else if (a.get(i).intValue() < b.get(i).intValue()) {

					bobScore++;
				}
			}

		}

		List<Integer> scores = new LinkedList<Integer>();
		scores.add(aliceScore);
		scores.add(bobScore);
		return scores;
	}

	/**
	 * <p>
	 * Challenge: Diagonal Difference
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/diagonal-difference/problem">Diagonal
	 *      Difference</a>
	 * @author clozarr
	 **/
	public static int diagonalDifference(List<List<Integer>> arr) {

		int subtraction = 0;
		int mainDiagonalSum = 0;
		int secondaryDiagonalSum = 0;

		for (int i = 0; i < arr.size(); i++) {

			List<Integer> subArray = arr.get(i);

			for (int j = 0; j < subArray.size(); j++) {

				// add main diagonal
				if (i == j) {

					mainDiagonalSum += subArray.get(j);

				}

				// add secondary diagonal
				if ((i + j) == (subArray.size() - 1)) {

					secondaryDiagonalSum += subArray.get(j);
				}
			}

		}

		subtraction = Math.abs(mainDiagonalSum - secondaryDiagonalSum);
		return subtraction;

	}

	/**
	 * <p>
	 * Challenge: A Very Big Sum
	 * </p>
	 * 
	 * @see <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem">A
	 *      Very Big Sum</a>
	 * @author clozarr
	 **/
	public static long aVeryBigSum(long[] ar) {

		long sum = 0;

		for (long element : ar)
			sum += element;

		return sum;

	}

	/**
	 * <p>
	 * Challenge: Plus Minus
	 * </p>
	 * 
	 * @see <a href="https://www.hackerrank.com/challenges/plus-minus/problem">Plus
	 *      Minus</a>
	 * @author clozarr
	 **/
	public static void plusMinus(int[] arr) {

		int positives = 0;
		int negatives = 0;
		int zeros = 0;
		int totalItems = arr.length;

		for (int element : arr) {

			if (element == 0)
				zeros++;
			if (element < 0)
				negatives++;
			if (element > 0)
				positives++;

		}

		float positivePercent = (float) positives / totalItems;
		float negativepercent = (float) negatives / totalItems;
		float zerosPercent = (float) zeros / totalItems;

		System.out.println(String.format("%.6f", positivePercent));
		System.out.println(String.format("%.6f", negativepercent));
		System.out.println(String.format("%.6f", zerosPercent));
	}
	
}
