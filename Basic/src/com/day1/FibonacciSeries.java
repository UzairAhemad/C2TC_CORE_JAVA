package com.day1;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 1, c = 0,  n;       
		System.out.print("Enter Maximum Value of Fibonacci Series: ");
		n = sc.nextInt();    
				
		while(c <= n) 
		{
			System.out.print(" " + c);     
			a = b;
			b = c;
			c = a + b;
			
		}
	
	}

}
