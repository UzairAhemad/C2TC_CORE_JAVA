package com.day17;
import java.util.Scanner;
public class OwnException {

	public static void main(String[] args) {
		// User difined Exception
		
		int age;
		System.out.println("Enter the age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age < 18) {
			throw new CantVote("")
		}

	}

}
