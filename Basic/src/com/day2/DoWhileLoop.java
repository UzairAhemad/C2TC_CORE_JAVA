package com.day2;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		The Java for loop is used to iterate a part of the program several times. 
		If the number of iteration is not fixed and you must have to execute the loop at least once,
		it is recommended to use a do-while loop.
		 */
		
		int i = 1; // Initialisation expression
		do {
			System.out.println(i); // Print the statement
			i++; // Update expression
		} while(i <= 10); // Test expression
		

	}

}
