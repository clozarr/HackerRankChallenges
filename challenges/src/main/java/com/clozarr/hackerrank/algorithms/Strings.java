package com.clozarr.hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Strings {

	
	
	
	
	/**
	 * <p>
	 * Challenge: Game of Thrones - I
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/arrays-ds/problem">Game of Thrones - I
	 *      </a>
	 *      
	 * @author clozarr
	 **/
	public static String gameOfThrones(String s) {

		Map<Character, Integer> ocurrences = new HashMap<>();
		char c = ' ';

		for (int i = 0; i < s.length(); i++) {

			c = s.charAt(i);
			if (!ocurrences.containsKey(c))
				ocurrences.put(c, 1);
			else
				ocurrences.put(c, ocurrences.get(c) + 1);
		}

		
		int countOdd = 0;

		for (Entry<Character, Integer> e : ocurrences.entrySet()) {

			  if(e.getValue() % 2 != 0)
				  countOdd++;
		}

		return (countOdd <= 1) ? "YES" : "NO";

	}
	
	public static int determinigDNAHealth(String[] genes, int[] health, String d, int first, int last) {

		String g = "";
		int h = 0;
		int sum = 0;

		Map<String, Integer> healtyGenes = new HashMap<>();

		for (int i = first; i <= last; i++) {

			g = genes[i];
			h = health[i];

			
			if (!healtyGenes.containsKey(g))
				healtyGenes.put(g, h);
			else
				healtyGenes.put(g, healtyGenes.get(g) + h);
		}

		int ocurrences = 0;
	

		for (Entry<String, Integer> e : healtyGenes.entrySet()) {

			if (d.indexOf(e.getKey()) != -1) {

			

				ocurrences = d.split(e.getKey(),-1).length;

				sum += (ocurrences * e.getValue());

				/*
				 * System.out.println( "d: " + d + " gene: " + e.getKey() + " value: " +
				 * e.getValue() + " ocurrences: " + ocurrences);
				 */
			}

		}

		return sum;

	}


	
}
