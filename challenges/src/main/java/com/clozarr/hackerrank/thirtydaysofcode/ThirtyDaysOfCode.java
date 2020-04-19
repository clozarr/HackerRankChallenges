package com.clozarr.hackerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ThirtyDaysOfCode {

	/**
	 * <p>
	 * Challenge Day 0: Hello, World
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/sparse-arrays/problem">Hello,
	 *      World</a>
	 * 
	 * @author clozarr
	 **/
	public static void helloWorld() {

		System.out.println("Hello, World.");
	}

	/**
	 * <p>
	 * Challenge Day 1: Data Types
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-data-types/problem">Data
	 *      Types</a>
	 * 
	 * @author clozarr
	 **/

	public static void dataTypes() {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int integerNumber = 0;
		double doubleNumber;
		String string;

		/* Read and save an integer, double, and String to your variables. */
		integerNumber = Integer.parseInt(scan.nextLine());
		doubleNumber = Double.parseDouble(scan.nextLine());
		string = scan.nextLine();

		/* Print the sum of both integer variables on a new line. */
		System.out.println(integerNumber + i);

		/* Print the sum of the double variables on a new line. */
		System.out.println(doubleNumber + d);

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + string);

		scan.close();

	}

	/**
	 * <p>
	 * Challenge Day 2: Operators
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-operators/problem">
	 *      Operators</a>
	 * 
	 * @author clozarr
	 **/
	public static void solve(double meal_cost, int tip_percent, int tax_percent) {

		double tip = meal_cost * ((double) tip_percent / 100);
		double tax = meal_cost * ((double) tax_percent / 100);

		double totalCost = meal_cost + tip + tax;
		System.out.println(Math.round(totalCost));

	}

	/**
	 * <p>
	 * Challenge Day 3: intro to Conditional Statements
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-conditional-statements/problem">
	 *      Intro to Conditional Statements</a>
	 * 
	 * @author clozarr
	 **/
	public static void conditionalStatement(int n) {

		String message = "";
		if (n >= 2 && n <= 5) {

			if (isEven(n))
				message = "Not Weird";
			else
				message = "Weird";

		} else if (n >= 6 && n <= 20) {

			if (isEven(n))
				message = "Weird";
			else
				message = "Not Weird";

		} else {

			if (isEven(n))
				message = "Not Weird";
			else
				message = "Weird";
		}

		System.out.println(message);

	}

	private static boolean isEven(int n) {
		return n % 2 == 0;
	}

	/**
	 * <p>
	 * Challenge Day 4: Class vs. Instance
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-class-vs-instance/problem">
	 *      Class vs. Instance</a>
	 * 
	 * @author clozarr
	 **/
	public static void classVsInstance() {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();

	}

	/**
	 * <p>
	 * Challenge Day 5: Loops
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-loops/problem">
	 *      Loops</a>
	 * 
	 * @author clozarr
	 **/

	public static void loops(int n) {

		int result = 1;

		for (int i = 1; i <= 10; i++) {

			result = n * i;
			System.out.println(n + " x " + i + " = " + result);
		}

	}

	/**
	 * <p>
	 * Challenge Day 6: Let's Review
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-loops/problem"> Let's
	 *      Review</a>
	 * 
	 * @author clozarr
	 **/
	public static void printOddAndEven(String s) {

		String even = "";
		String odd = "";
		for (int i = 0; i < s.length(); i++) {

			if (i % 2 == 0)
				even += s.charAt(i);
			else
				odd += s.charAt(i);
		}

		System.out.println(even + " " + odd);

	}

	/**
	 * <p>
	 * Challenge Day 7: Arrays
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-arrays/problem">
	 *      Arrays</a>
	 * 
	 * @author clozarr
	 **/
	public static void solveArray(int array[]) {

		StringBuilder rs = new StringBuilder();
		for (int i = array.length - 1; i >= 0; i--) {

			rs.append(array[i]).append(" ");
		}
		System.out.println(rs.toString().trim());
	}

	/**
	 * <p>
	 * Challenge Day 8: Dictionaries and Maps
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem">
	 *      Dictionaries and Maps</a>
	 * 
	 * @author clozarr
	 **/
	private static Map<String, Integer> bookPhone = new HashMap<String, Integer>();

	public static void makeBookPhone(String name, int phoneNumber) {

		bookPhone.put(name, phoneNumber);

	}

	public static void printBookPhone(String name) {

		if (bookPhone.containsKey(name))
			System.out.println(name + "=" + bookPhone.get(name));
		else
			System.out.println("Not found");
	}

	/**
	 * <p>
	 * Challenge Day 9: Recursion
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-recursion/problem">
	 *      Recursion</a>
	 * 
	 * @author clozarr
	 **/
	public static int factorial(int n) {

		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	/**
	 * <p>
	 * Challenge Day 10: Binary Numbers
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-binary-numbers/problem">
	 *      Binary Numbers</a>
	 * 
	 * @author clozarr
	 **/
	public static void binaryNumbers(int n) {

		int mod = 0;
		int maximum = 0;
		int count = 0;
		;
		List<Integer> binary = new ArrayList<>();
		while (n >= 2) {

			mod = n % 2;
			binary.add(mod);
			n /= 2;

		}
		binary.add(n);

		for (int i = binary.size() - 1; i >= 0; i--) {

			if (binary.get(i) == 1) {
				count++;
				if (count > maximum)
					maximum = count;
			} else {
				count = 0;
			}
		}

		System.out.println(maximum);
	}

	/**
	 * <p>
	 * Challenge Day 11: 2D Arrays
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-2d-arrays/problem">
	 *      2D Arrays</a>
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
	 * Challenge Day 12: Inheritance
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-inheritance/problem">
	 *      Inheritance</a>
	 *      
	 * @author clozarr
	 **/
	public static void inheritance() {

		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();
		/** @see {@link Student}} */
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());

	}
}
