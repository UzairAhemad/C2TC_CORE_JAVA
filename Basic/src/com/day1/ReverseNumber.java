package com.day1;
import java.util.Scanner;

public class ReverseNumber {

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
		System.out.println("Reverse Number is: " + rev);

	}

}
