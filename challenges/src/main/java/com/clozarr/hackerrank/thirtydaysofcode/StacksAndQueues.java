package com.clozarr.hackerrank.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
* <p>
* Challenge Day 18: Queues and Stacks
* </p>
* 
* @see <a href= "https://www.hackerrank.com/challenges/30-queues-stacks/problem">
*      Queues and Stacks</a>
*      
*
* @author clozarr
**/
class StacksAndQueues {

	Stack<Character> stack = new Stack<>();
	Queue<Character> queue = new LinkedList<Character>();

	public void pushCharacter(char ch) {

		stack.add(ch);

	}

	void enqueueCharacter(char ch) {

		queue.add(ch);
	}

	
	char popCharacter() {

		return stack.pop();
	}

	char dequeueCharacter() {

		return queue.remove();
	}

}
