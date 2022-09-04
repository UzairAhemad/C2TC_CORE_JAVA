package com.day16;
	// Polymorphism using method overriding

	class Language{		
		void display() {
			System.out.println("Commen English Language");
		}
	}
	class Java extends Language{
		@Override
		void display() {
			System.out.println("Java Programming Language");
		}
	}
	
public class Polymorphism {

	public static void main(String[] args) {

		// Creating Object of Java class
		Java j1 = new Java();
		j1.display();
		
		// Creating Object of Language class
		Language l1 = new Language();
		l1.display();

	}

}
