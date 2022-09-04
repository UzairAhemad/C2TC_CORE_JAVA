package com.day2;
import java.util.*;
public class SwitchInJava {

	public static void main(String[] args) {
		
		/*
		 Java Switch Statement:-
		 The Java switch statement executes one statement from multiple conditions.
		 It is like if-else-if ladder statement.
		 */
		
		int a, b, Operation;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First value: ");
		a = sc.nextInt();
		
		System.out.print("Enter the Second value: ");
		b = sc.nextInt();
		
		System.out.print("What you want to perform operation (1.add, 2.sub, 3.multi, 4.div): ");
		Operation = sc.nextInt();
		
		switch(Operation) {
		
		case 1:
			System.out.print("Addition is: " + (a + b));
			break;
		case 2:
			System.out.print("Submition is: " + (a - b));
			break;
		case 3:
			System.out.print("Multiplication is: " + (a * b));
			break;
		case 4: 
			System.out.print("Division is: "+ (a / b));
			break;
		default:
			System.out.println("Invalid Choice");
			
		}	

	}

}
