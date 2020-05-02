package com.clozarr.hackerrank.thirtydaysofcode;

/**
 * <p>
 * Challenge Day 22:  Binary Search Trees
 * </p>
 * 
 * @see <a href= "https://www.hackerrank.com/challenges/30-binary-search-trees/problem">
 *       Binary Search Trees</a>
 * 
 *
 * @author clozarr
 **/

public class NodeTree {

	NodeTree left, right;
	int data;

	NodeTree(int data) {
		this.data = data;
		left = right = null;
	}

}
