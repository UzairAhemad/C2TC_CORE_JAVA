package com.day1;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number, rev = 0;
		System.out.print("Enter Number to find Reverse : ");
		number = sc.nextInt();
		
		while(number > 0)
		{
			rev = (rev * 10) + number % 10;
			number = number / 10;
		}
//		if(number == rev)
//			System.out.println("The Enter Number is " + number + " is a Palindrome");
//		else
//			System.out.println("The Enter Number is " + number + " is not a Palindrome");

		
		
		
		

	}

}
