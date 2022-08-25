package com.day9;
import java.util.Scanner;

public class Day9InClass {

	public static void main(String[] args) {
		
		// for lenght of Array.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");   //  Taking the size of Array from the user.
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the element of Array: ");    // Taking the element of Array from the user.
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("This is the size of Array: " + arr.length);		// print Length of Array. 
				
	}

}
