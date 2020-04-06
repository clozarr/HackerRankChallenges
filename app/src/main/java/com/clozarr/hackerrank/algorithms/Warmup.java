package com.clozarr.hackerrank.algorithms;


import java.util.LinkedList;
import java.util.List;

/**
 * 
 **/
public class Warmup {

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

		int suma = 0;
		for (int element : ar) {

			suma += element;
		}
		return suma;
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

		int resta = 0;
		int sumaDiagonalprincipal = 0;
		int sumaDiagonalSecundaria = 0;

		for (int i = 0; i < arr.size(); i++) {

			List<Integer> subArray = arr.get(i);

			for (int j = 0; j < subArray.size(); j++) {

				// Sumar la diagonal principal
				if (i == j) {

					sumaDiagonalprincipal += subArray.get(j);

				}

				// Sumar la diagonal secundaria
				if ((i + j) == (subArray.size() - 1)) {

					sumaDiagonalSecundaria += subArray.get(j);
				}
			}

		}

		resta = Math.abs(sumaDiagonalprincipal - sumaDiagonalSecundaria);
		return resta;

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

		long suma = 0;

		for (long element : ar)
			suma += element;

		return suma;

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

		int totalPositivos = 0;
		int totalNegativos = 0;
		int totalCeros = 0;
		int totalElementos = arr.length;

		for (int element : arr) {

			if (element == 0)
				totalCeros++;
			if (element < 0)
				totalNegativos++;
			if (element > 0)
				totalPositivos++;

		}

		float porcentajePositivo = (float) totalPositivos / totalElementos;
		float porcentajeNegativo = (float) totalNegativos / totalElementos;
		float porcentajeCeros = (float) totalCeros / totalElementos;

		System.out.println(String.format("%.6f", porcentajePositivo));
		System.out.println(String.format("%.6f", porcentajeNegativo));
		System.out.println(String.format("%.6f", porcentajeCeros));
	}

	/**
	 * <p>
	 * Challenge: Arrays - DS
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/plus-minus/problem">Arrays - DS
	 *      </a>
	 * @author clozarr
	 **/
	public static int[] reverseArray(int[] a) {

		int output[] = new int[a.length];
		int index = 0;

		for (int i = a.length - 1; i >= 0; i--) {

			output[index++] = a[i];
		}

		return output;
	}

}
