package com.clozarr.hackerrank.thirtydaysofcode;

import java.util.Arrays;

/**
 * <p>
 * Challenge Day 21: Generics
 * </p>
 * 
 * @see <a href= "https://www.hackerrank.com/challenges/30-generics/problem">
 *      Generics</a>
 * 
 *
 * @author clozarr
 **/
class Printer<T> {

	void printArray(T[] arr) {

		Arrays.stream(arr).forEach(System.out::println);
	}

}
