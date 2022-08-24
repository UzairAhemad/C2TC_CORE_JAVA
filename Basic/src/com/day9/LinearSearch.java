package com.day9;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		// Take an array as input from the user.Search for a given number "X" and print the index at which it occurs. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");    //  Taking the size of Array from the user.
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		System.out.print("Enter the element of the Array: ");   // Taking the element of Array from the user.
		for(int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.print("Enter the value of (x): ");   // Taking the value of "x" from the user.
		int x = sc.nextInt();
		
		for(int i = 0; i < numbers.length; i++) {		// Finding "x" in array.
			if(numbers[i] == x) {
				System.out.print("(x) found at index: " + i );
			}
		}
		
		
	}

}
