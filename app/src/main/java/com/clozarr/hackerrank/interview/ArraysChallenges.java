package com.clozarr.hackerrank.interview;



//import java.util.Arrays;

public class ArraysChallenges {

	/**
	 * <p>
	 * Challenge: Array Manipulation
	 * </p>
	 * 
	 * @see <a href="https://www.hackerrank.com/challenges/crush/problem">Array
	 *      Manipulation</a>
	 * @author clozarr
	 **/
	public static long arrayManipulation(int n, int[][] queries) {

		long array[] = new long[n + 2]; 

		int lenQueries = queries.length;

		int a = 0, b = 0;
		long k = 0;
		long mayor = Long.MIN_VALUE;
		long suma = 0;

		for (int i = 0; i < lenQueries; i++) {

			a = queries[i][0];// Indice inicial
			b = queries[i][1];// Indice final
			k = queries[i][2]; // valor a rellenar

			array[a] += k;
			array[b + 1] -= k;

		}

		for (int j = 0; j < array.length; j++) {

			suma += array[j];
			if (suma > mayor)
				mayor = suma;

		}

		return mayor;

	}

}
