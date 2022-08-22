package com.day1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, rev = " ";
		System.out.print("Enter Your String: ");
		str = sc.next();
		
		int len = str.length();
		for(int i = len - 1; i >= 0; i--)
			{
				rev = rev + str.charAt(i);
			}
		System.out.println("Reversed String: " + rev);
			
	}

}
