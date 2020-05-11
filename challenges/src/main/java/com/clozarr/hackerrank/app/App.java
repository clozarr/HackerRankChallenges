package com.clozarr.hackerrank.app;

import java.util.ArrayList;
import java.util.List;
import com.clozarr.hackerrank.datastructures.Arrays;
import com.clozarr.hackerrank.thirtydaysofcode.Node;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		// printOddAndEven("Rank");

		/*
		 * int[] arr = { -4, 3, -9, 0, 4, 1 }; Warmup.plusMinus(arr); int[] r =
		 * Warmup.reverseArray(arr);
		 * 
		 * Arrays.stream(r).forEach(System.out::println);
		 * 
		 * int queries[][] = { { 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } };
		 * int sizeOutputArray = 10;
		 * 
		 * long v = ArraysChallenges.arrayManipulation(sizeOutputArray, queries);
		 * System.out.println("Max: " + v);
		 * 
		 * int array[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0,
		 * 0, 0 }, { 0, 0, 2, 4, 4, 0 }, { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		 * int mayor = Warmup.hourglassSum(array); System.out.println(mayor);
		 */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * 
		 * int n = scan.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * String word = scan.nextLine(); scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * printOddAndEven(word.isEmpty()?"-":word); }
		 * 
		 * scan.close();
		 */

		/*
		 * List<Integer> a = new ArrayList<Integer>(); a.add(1); a.add(0); a.add(5);
		 * List<Integer> b = new ArrayList<Integer>(); b.add(1); b.add(1); b.add(7);
		 * List<Integer> c = new ArrayList<Integer>(); c.add(1); c.add(0); c.add(3);
		 * List<Integer> d = new ArrayList<Integer>(); d.add(2); d.add(1); d.add(0);
		 * List<Integer> e = new ArrayList<Integer>(); e.add(2); e.add(1); e.add(1);
		 * 
		 * List<List<Integer>> queries = new ArrayList<List<Integer>>(); queries.add(a);
		 * queries.add(b); queries.add(c); queries.add(d); queries.add(e);
		 * 
		 * List<Integer> r = Arrays.dynamicArray(2, queries);
		 * r.stream().forEach(System.out::println);
		 */

		Node head = new Node(3);
		head = insert(head, 9);
		head = insert(head, 9);
		head = insert(head, 11);
		head = insert(head, 11);
		head = insert(head, 11);
		head = insert(head, 11);
		head = insert(head, 89);
		head = insert(head, 89);
		head = insert(head, 100);
		head = insert(head, 100);
		head = insert(head, 101);
		head = insert(head, 102);
		head = insert(head, 103);
		head = insert(head, 108);
		head = insert(head, 200);
		head = insert(head, 250);
		head = insert(head, 250);
		head = insert(head, 250);
		head = insert(head, 250);

		display(head);
		System.out.println("\nRemoving duplicates ...");
		head = removeDuplicates(head);
		display(head);

	}

	static void printOddAndEven(String s) {

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

	public static Node insert(Node head, int data) {
		// Complete this method

		Node n = new Node(data);
		if (head == null)
			head = n;
		else {
			Node start = head;
			while (start.next != null) {
				start = start.next;
			}
			start.next = n;
		}

		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node removeDuplicates(Node head) {
		// Write your code here

		Node iterator = head;

		while (iterator.next != null) {

			if (iterator.data == iterator.next.data)
				iterator.next = iterator.next.next;
			else
				iterator = iterator.next;
		}

		return head;
	}

}
