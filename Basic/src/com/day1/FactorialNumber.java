package com.day1;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numnber to find Factorial: ");
		n = sc.nextInt();
		System.out.println("Your Number of Factorial is ");
		
		for(int i = 1; i < n; i++) 
			System.out.print( " " + i + " ");
		
		while( n >= 1)
		{
			fact = fact * n;
			--n;
		}
		
		System.out.println(" - Your Factorial Number is: " + fact);


	}

}
