package com.day11;

public class Day11InClass {

	public static void main(String[] args) {
		
		// Cpmpairing the Strings.
			
		String name1 = "Hello";  
		String name2 = "Hello";

		/* Comparing two string using ( == )  sign & ( == ) method responsible for reference Comparison.*/
		
		System.out.print("Your String Comparison is: ");
		System.out.println(name1 == name2);
		
		/* Comparing two string using ( .equals ) & .equals method responsible for content Comparison. */
		
		System.out.print("String Comparison using .equals: "); 
		System.out.println(name1.equals(name2));	
		
		
	}

}
