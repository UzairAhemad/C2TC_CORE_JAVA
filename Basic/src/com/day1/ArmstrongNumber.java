package com.day1;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n, z, count = 0, digit, i, pro, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Some Number: ");
		n = sc.nextInt();
		z = n;
		while(z > 0) {
			count++;
			z = z / 10;
		}
		z =  n;
		while(z > 0) {
			digit = z % 10;
			pro = 1;
			
			for(i = 1; i <= count; i++)
				pro = pro * digit;
				sum = sum + pro;
				z = z / 10;
		} 
		if(sum == n)
			System.out.println(n + " It is an Armstrong Number");
		else 
			System.out.println(n + " It is not an Armstrong Number");
		
	}

}
