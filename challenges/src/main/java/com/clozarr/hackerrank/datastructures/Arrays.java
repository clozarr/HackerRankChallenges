package com.clozarr.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Arrays {

	/**
	 * <p>
	 * Challenge: Arrays - DS
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/arrays-ds/problem">Arrays - DS
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
	
	/**
	 * <p>
	 * Challenge: 2D Array - DS
	 * </p>
	 * 
	 * @see <a href="https://www.hackerrank.com/challenges/2d-array/problem">2D Array - DS
	 *      </a>
	 *      
	 * @author clozarr
	 **/
	public static int hourglassSum(int[][] arr) {

		int sum = 0;
		int higher = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[0].length - 2; j++) {

				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];

				if (sum > higher) {

					higher = sum;
				}

			}

		}

		return higher;

	}
	
	/**
	 * <p>
	 * Challenge: Dynamic Array
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/dynamic-array/problem">Dynamic
	 *      Array</a>
	 * @author clozarr
	 **/
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		// Write your code here

		int lastAnswer = 0;
		int queryType = 0;
		int x = 0;
		int y = 0;
		int seq = 0;
		int index = 0;

		List<Integer> response = new ArrayList<Integer>();
		Map<Integer, List<Integer>> seqList = new HashMap<Integer, List<Integer>>();

		for (Iterator<List<Integer>> iterator = queries.iterator(); iterator.hasNext();) {
			List<Integer> list = iterator.next();

			queryType = list.get(0);
			x = list.get(1);
			y = list.get(2);
			seq = ((x ^ lastAnswer) % n);

			switch (queryType) {

			case 1:
				seqList.putIfAbsent(seq, new ArrayList<Integer>());
				seqList.get(seq).add(y);
				break;
			case 2:
				seqList.putIfAbsent(seq, new ArrayList<Integer>());
				index = y % seqList.get(seq).size();
				lastAnswer = seqList.get(seq).get(index);
				response.add(lastAnswer);
				break;

			default:
				break;
			}

		}

		return response;

	}
	
	
	/**
	 * Challenge: Left Rotation </p>
	 * 
	 * @see <a href=
	 * "https://www.hackerrank.com/challenges/array-left-rotation/problem">Left
	 * Rotation </a>
	 * 
	 * @author clozarr
	 **/

	public static void leftRotation(int rotationNumber, int[] arr) {

		StringBuilder response = new StringBuilder();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (rotationNumber < arr.length) {

				response.append(arr[rotationNumber]).append(" ");
				rotationNumber++;
			} else {

				response.append(arr[count]).append(" ");
				count++;

			}

		}

		System.out.println(response.toString().trim());

	}
	
	/**
	 * Challenge: Sparse Arrays </p>
	 * 
	 * @see <a href=
	 * "https://www.hackerrank.com/challenges/sparse-arrays/problem">Sparse
	 * Arrays</a>
	 * 
	 * @author clozarr
	 **/
	public static int[] matchingStrings(String[] strings, String[] queries) {

		int response[] = new int[queries.length];
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {

			if (!map.containsKey(strings[i]))
				map.put(strings[i], 1);
			else
				map.put(strings[i], map.get(strings[i]) + 1);

		}

		for (int i = 0; i < queries.length; i++) {

			if (map.containsKey(queries[i]))
				response[i] = map.get(queries[i]);
		}

		return response;

	}
	
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

		int totalQueries = queries.length;

		int a = 0, b = 0;
		long k = 0;
		long higher = Long.MIN_VALUE;
		long sum = 0;

		for (int i = 0; i < totalQueries; i++) {

			a = queries[i][0];
			b = queries[i][1];
			k = queries[i][2];

			array[a] += k;
			array[b + 1] -= k;

		}

		for (int j = 0; j < array.length; j++) {

			sum += array[j];
			if (sum > higher)
				higher = sum;

		}

		return higher;

	}
	
	
}
