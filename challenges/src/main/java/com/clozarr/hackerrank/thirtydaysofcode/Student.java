package com.clozarr.hackerrank.thirtydaysofcode;


/**
 * <p>
 * Challenge Day 12: Inheritance
 * </p>
 * 
 * @see <a href=
 *      "https://www.hackerrank.com/challenges/30-inheritance/problem">
 *      Inheritance</a>
 *      
 * @see {@link Person}}
 * @author clozarr
 **/
public class Student extends Person{

	
	
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

public Student(String fn, String ln, int id, int [] ts) {
        
        super(fn,ln,id);
        this.testScores = ts;
        
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        
        int sum = 0;
        for (int i : this.testScores) {
            
            sum+= i;
        }
        
        int a = sum / this.testScores.length;
        
        if(a>=90 && a <=100)
           return 'O';
        else if(a>=80 && a < 90)
           return 'E';    
        else if(a>=70 && a < 80)
           return 'A';    
        else if(a>=55 && a < 70)
           return 'P';    
        else if(a>=40 && a < 55)
           return 'D';
        else
           return 'T';    
    }
}
