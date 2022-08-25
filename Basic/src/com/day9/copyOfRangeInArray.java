package com.day9;
import java.util.Arrays;
public class copyOfRangeInArray {

	public static void main(String[] args) {
		
		// copyOfRange is use to Copies the specified range of the specified array into a new array.
		
		int Array1[] = new int[] {5,10,15,6,7};   // Creating the Array.
		System.out.println("Array1 is: " + Arrays.toString(Array1));	// Printing the Array using Arrays.toString().
		
		int Array2[] = Arrays.copyOfRange(Array1, 0, 3);   // Copy the element from Array1 to Array2 index from 0 to 3.
		System.out.println("Array2 is: " + Arrays.toString(Array2));   // Printing the coped element from Array1 to Array2.

	}

}
