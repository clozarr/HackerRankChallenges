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
		/** @see {@link Student} */
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());

	}

	/**
	 * <p>
	 * Challenge Day 13: Abstract Classes
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-abstract-classes/problem">
	 *      Abstract Classes</a>
	 * 
	 * @author clozarr
	 **/
	public static void abstractClass() {

		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		/** @see {@link MyBook} */
		Book book = new MyBook(title, author, price);
		book.display();

	}

	/**
	 * <p>
	 * Challenge Day 14: Scope
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-scope/problem">
	 *      Scope</a>
	 * 
	 * @author clozarr
	 **/
	public static void scope() {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		/** @see {@link Difference} */
		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}

	/**
	 * <p>
	 * Challenge Day 15: Linked List
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-linked-list/problem">
	 *      Linked List</a>
	 * 
	 * @see {@link Node}
	 *
	 * @author clozarr
	 **/
	public static void linkedList() {

		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = Solution.insert(head, ele);
		}
		Solution.display(head);
		sc.close();

	}

	/**
	 * <p>
	 * Challenge Day 16: Exceptions
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem">
	 *      Exceptions</a>
	 * 
	 *
	 * @author clozarr
	 **/
	public static void exceptions(String n) {

		try {

			int number = Integer.parseInt(n);
			System.out.println(number);

		} catch (NumberFormatException e) {

			System.out.println("Bad String");
		}

	}

	/**
	 * <p>
	 * Challenge Day 17: More Exceptions
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-more-exceptions/problem"> More
	 *      Exceptions</a>
	 * 
	 *
	 * @author clozarr
	 **/
	public static void moreException() {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();

			/** @see {@link Calculator} */
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();

	}

	/**
	 * <p>
	 * Challenge Day 18: Queues and Stacks
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-queues-stacks/problem"> Queues
	 *      and Stacks</a>
	 * 
	 *
	 * @author clozarr
	 **/
	public static void stacksAndQueues() {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		StacksAndQueues p = new StacksAndQueues();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));

	}

	/**
	 * <p>
	 * Challenge Day 19: Interfaces
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-interfaces/problem">
	 *      Interfaces</a>
	 * 
	 *
	 * @author clozarr
	 **/
	public static void interfaces() {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		/** @see {@link MyCalculator} */
		AdvancedArithmetic myCalculator = new MyCalculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

	/**
	 * <p>
	 * Challenge Day 20: Sorting
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-sorting/problem">
	 *      Sorting</a>
	 * 
	 *
	 * @author clozarr
	 **/
	public static void sorting() {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int numberOfSwaps = 0;
		int swap = 0;

		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {

					swap = a[j];
					a[j] = a[j + 1];
					a[j + 1] = swap;
					numberOfSwaps++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}

		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
		in.close();
	}

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
	public static void generics() {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}

		n = scanner.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = scanner.next();
		}

		/** @see {@link Printer} */
		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);
		if (Printer.class.getDeclaredMethods().length > 1) {
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
		scanner.close();

	}

	/**
	 * <p>
	 * Challenge Day 22: Binary Search Trees
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-binary-search-trees/problem">
	 *      Binary Search Trees</a>
	 * 
	 *
	 * @author clozarr
	 **/
	public static void tree() {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		NodeTree root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = Tree.insert(root, data);
		}
		/** @see {@Tree @NodeTree} */
		int height = Tree.getHeight(root);
		System.out.println(height);
		sc.close();
	}

	/**
	 * <p>
	 * Challenge Day 23: BST Level-Order Traversal
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-binary-trees/problem"> BST
	 *      Level-Order Traversal</a>
	 * 
	 *
	 * @author clozarr
	 **/
	public static void treeLevelOrderTraversal() {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		NodeTree root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = Tree.insert(root, data);
		}
		Tree.levelOrder(root);
       sc.close();
	}

	/**
	 * <p>
	 * Challenge Day 24: More Linked List
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-linked-list-deletion/problem">
	 *      More Linked List</a>
	 * 
	 * @author clozarr
	 **/
	public static void moreLinkedList() {

		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = Solution.insert(head, ele);
		}
		head = Solution.removeDuplicates(head);
		Solution.display(head);
		sc.close();
	}

	/**
	 * <p>
	 * Challenge Day 25: Running Time and Complexity
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem">
	 *      Running Time and Complexity</a>
	 * 
	 * @author clozarr
	 **/

	public static void runningTimeAndComplexity() {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();

			boolean response = isPrime(n);
			System.out.println(response ? "Prime" : "Not prime");
		}
		scanner.close();

	}

	private static boolean isPrime(int n) {

		if (n == 2)
			return true;
		if (n == 1 || n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {

			if (n % i == 0)
				return false;
		}

		return true;
	}

	/**
	 * <p>
	 * Challenge Day 26: Nested Logic
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-nested-logic/problem"> Nested
	 *      Logic</a>
	 * 
	 * @author clozarr
	 **/
	public static void nestedLogic() {

		Scanner scanner = new Scanner(System.in);
		String actualDate = scanner.nextLine();
		String expectedDate = scanner.nextLine();
		System.out.println(calculate(actualDate, expectedDate));
		scanner.close();
		
		
	}

	public static int calculate(String actualDate, String expectedDate) {
		int fine = 0;

		String[] actual = actualDate.split(" ");
		String[] expected = expectedDate.split(" ");

		// Actual date
		int actualDay = Integer.parseInt(actual[0]);
		int actualMonth = Integer.parseInt(actual[1]);
		int actualYear = Integer.parseInt(actual[2]);

		// Expected date
		int expectedDay = Integer.parseInt(expected[0]);
		int expectedMonth = Integer.parseInt(expected[1]);
		int expectedYear = Integer.parseInt(expected[2]);

		/*
		 * Case 1: the book is returned on or before the expected return date, no fine
		 * will be charged. fine = 0;
		 */
		if (actualYear < expectedYear)
			fine = 0;
		else if(actualYear == expectedYear && actualMonth < expectedMonth)
			fine = 0;
		else if(actualYear == expectedYear && actualMonth == expectedMonth && actualDay <= expectedDay)  
			fine = 0;
		/*
		 * Case 2: the book is returned after the expected return day but still within
		 * the same calendar month and year as the expected return date, fine = 15 x
		 * (the number of days later)
		 */
		else if (actualDay > expectedDay && actualMonth <= expectedMonth && actualYear <= expectedYear)
			fine = 15 * (actualDay - expectedDay);

		/*
		 * Case 3: If the book is returned after the expected return month but still
		 * within the same calendar year as the expected return date, fine = 500 x (the
		 * number of months late)
		 */
		else if (actualMonth > expectedMonth && actualYear <= expectedYear)
			fine = 500 * (actualMonth - expectedMonth);

		/*
		 * Case 4: the book is returned after the calendar year in which it was
		 * expected, there is a fixed of fine = 10000
		 */
		else if (actualYear > expectedYear)
			fine = 10000;
		
		
		return fine;
	}
	
	/**
	 * <p>
	 * Challenge Day 27: Testing
	 * </p>
	 * 
	 * @see <a href=
	 *      "https://www.hackerrank.com/challenges/30-testing/problem?"> Testing
	 *      </a>
	 * 
	 * @author clozarr
	 **/
   public static void testing() {
	   
	   /*@see SolutionTesting */
	   System.out.println("See class SolutionTesting");
   }
}
