package com.clozarr.hackerrank.thirtydaysofcode;


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
class Difference {

	
	private int[] elements;
  	public int maximumDifference;
	int absoluteDifference = 0; 
  	
  	public Difference(int [] arr) {
		// TODO Auto-generated constructor stub
  		this.elements = arr;
	}
  	
  	public void computeDifference() {
  		
  		maximumDifference = Integer.MIN_VALUE;
  		
  		for (int i = 0; i < elements.length; i++) {
			
  			for (int j = (i +1); j < elements.length; j++) {
				
  				absoluteDifference = Math.abs(elements[i] - elements[j]);
  				if(absoluteDifference > maximumDifference)
  					maximumDifference = absoluteDifference;
  				
			}
		}
  	}
  	
  	
	
}
