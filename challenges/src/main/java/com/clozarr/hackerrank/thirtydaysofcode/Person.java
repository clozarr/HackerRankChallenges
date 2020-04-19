package com.clozarr.hackerrank.thirtydaysofcode;


/**
 * <p>
 * Challenge Day 4: Class vs. Instance
 * </p>
 * 
 * @see <a href=
 *      "https://www.hackerrank.com/challenges/30-class-vs-instance/problem">
 *       Class vs. Instance</a>
 * 
 * @author clozarr
 **/
public class Person {

	 private int age;	
	  
		public Person(int initialAge) {
	  		// Add some more code to run some checks on initialAge
	          if(initialAge < 0){
	              System.out.println("Age is not valid, setting age to 0.");
	              this.age = 0;
	          }else{
	            this.age = initialAge;
	          }
		}

		public void amIOld() {
	  		// Write code determining if this person's age is old and print the correct statement:
	          if(this.age < 13)
	             System.out.println("You are young.");
	           else if(this.age >= 13 && this.age < 18)
	             System.out.println("You are a teenager.");
	           else
	             System.out.println("You are old.");  

		}

		public void yearPasses() {
	  		// Increment this person's age.
	          this.age++;
		}
		
		/**
		 * <p>
		 * Challenge Day 12: Inheritance
		 * </p>
		 * 
		 * @see <a href=
		 *      "https://www.hackerrank.com/challenges/30-inheritance/problem">
		 *      Inheritance</a>
		 * 
		 * @author clozarr
		 **/
	    private String firstName;
	    private String lastname;
	    private int id;
	    public Person(String fn, String ln, int id) {
			// TODO Auto-generated constructor stub
	    	this.firstName = fn;
	    	this.lastname = ln;
	    	this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	    
		public void printPerson() {
			System.out.println("Name: " + this.lastname + ", " + this.firstName);
			System.out.println("ID: " + this.id);
		}
	    
	    /** *************   END DAY 12 *************** */
}
