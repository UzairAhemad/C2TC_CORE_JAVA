package com.day14;

public class Day14InClass {

	String name; // it is object bound because its change every time.
	int roll;    // it is object bound because its change every time.
	static String coll = "Mumbai University"; // It is class bound not a object bound.
	
	void display() {
		System.out.println(name + " " + roll + " " + coll);
	}
	
	static void modify() {     // creating the static modify method to change the college name.
		coll = "Pune University";  // This is new college name.
	}
	public Day14InClass(String name, int roll) {  // This is Constructor
		super();
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) {
		
		// Whenever any method is static in nature we don't need object for calling that method
		// Now directly calling the method
		
		
		modify(); // This is method call after calling modify method all student college name changed by Mumbai University to Pune University. 
		Day14InClass st1 = new Day14InClass("Ravi", 10);   // Creating Object and give the values.
		st1.display();   // Calling a display method
		
		Day14InClass st2 = new Day14InClass("Rahul", 9);   // Creating Object and give the values.
		st2.display();   // Calling a display method
		
		Day14InClass st3 = new Day14InClass("Abhishek", 15); // here using modify method for modify college name.
		st3.display();  // Calling a display method
	

	}

}
