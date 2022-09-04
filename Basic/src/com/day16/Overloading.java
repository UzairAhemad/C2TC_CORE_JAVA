package com.day16;
	
	// Method Overloading
	class Demo{
		void display(int a, double b) {
			System.out.println("Method A");
		}
		void display(int a, double b, double c) {
			System.out.println("Method B");
		}
	}
public class Overloading {

	public static void main(String[] args) {
		Demo obj = new Demo();
		
		/* I am passing float value as a second argument but it got promoted to the type double, because there
		 * was not any method having arg list as (int, float)*/
		
		obj.display(100,20.67f);
		obj.display(12,12.65d,15.69f);
		
		
		/* Type Promotion table:
		   
		   byte  :> short -> int -> long -> double
		   short :> int -> long -> float -> double
		   int   :> long -> float -> double
		   float :> double
		   long  :> float -> double
		   char  :> int -> long -> float -> double */
		
	}

}
