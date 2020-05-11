package com.clozarr.hackerrank.thirtydaysofcode;

/**
 * <p>
 * Challenge Day 15: Linked List
 * </p>
 * 
 * @see <a href= "https://www.hackerrank.com/challenges/30-linked-list/problem">
 *      Linked List</a>
 * 
 * @author clozarr
 **/
public class Node {

	public int data;
	public Node next;

	public Node(int d) {
		data = d;
		next = null;
	}
}

class Solution {

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

	
	/**
	 * <p>
	 * Challenge Day 24: More Linked List
	 * </p>
	 * 
	 * @see <a href= "https://www.hackerrank.com/challenges/30-linked-list-deletion/problem">
	 *      More Linked List</a>
	 * 
	 * @author clozarr
	 **/
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

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

}