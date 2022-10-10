package com.day13;
import java.util.Scanner;

	class A{	 // This is Parent class
		int a, b;   
		void input() {   
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the First Number: ");   // Taking  value of "a" from the user using Scanner method.
			a = sc.nextInt();  
			
			System.out.print("Enter the Second Number: ");  // Taking  value of "b" from the user using Scanner method.
			b = sc.nextInt();
		}
		void add() {
			System.out.println("a & b Additoin is: " + (a + b)); // Addition of 
		}
	}
	
	class B extends A{  // This is Child class
		int c;
		void getdata() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Third Number: ");
			c = sc.nextInt();
		}
		void display() {
			System.out.println("a, b & c Addition is: " + (a + b + c));
		}
	}
	
public class SingleInheritance {

	public static void main(String[] args) {
		
		B obj = new B(); // Making 
		obj.input();
		obj.getdata();
		obj.add();
		obj.display();
		
	}

}
