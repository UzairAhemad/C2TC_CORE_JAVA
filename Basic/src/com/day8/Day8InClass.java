package com.day8;
import java.util.Scanner;

public class Day8InClass {

	public static void main(String[] args) {
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your Array: ");  // Taking input from the user.
		size = sc.nextInt();
		
		int[] arr = new int[10];	// Creating the Array
		System.out.println("Enter the Element of your Array: ");  // Taking the Array form the user
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Here is your Array: ");
		// printing the elements of Array
		
		for(int i = 0; i < size; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.print("Class and data type: ");
		System.out.print(arr.getClass ().getName());
	}

}
