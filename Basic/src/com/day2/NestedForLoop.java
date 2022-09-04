package com.day2;

public class NestedForLoop {

	public static void main(String[] args) {
		
		/* Java Nested for Loop
		   If we have a for loop inside the another loop, it is known as nested for loop. 
		   The inner loop executes completely whenever outer loop executes. */
		
		int weeks = 3;
	    int days = 7;

	    // Outer loop prints weeks
	    for (int i = 1; i <= weeks; ++i) {
	      System.out.println("Week: " + i);

	      // Inner loop prints days
	      for (int j = 1; j <= days; ++j) {
	        System.out.println("  Day: " + j);
	      }
	    }
	}
 
}
