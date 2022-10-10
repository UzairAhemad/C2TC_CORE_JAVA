package com.day17;

public class Practic {

	public static void main(String[] args) {
		
		// this is case2
		try {
			System.out.println(5+5);
			System.out.println(2/0);
			System.out.println(3);
		}
		// Exception 
		catch(ArithmeticException e){
			System.out.println(2/2); // 'e' is object of 1
			System.out.println("in side catch block");
		}
		// Priviliged block
		finally {
			System.out.println("i am finally block");
		}
		System.out.println("i am remaining Block");
	}

}
