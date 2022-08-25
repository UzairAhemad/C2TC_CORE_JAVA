package com.day9;

public class JoingOneORMoreString {

	public static void main(String[] args) {
		
		String name = new String("Uzair Ahemad"); // String is immutable can't be changed.
		System.out.print("This is String: ");
		name.concat(" Sayyed");   
		
		System.out.println(name);
		
		
		StringBuffer name1 = new StringBuffer("New"); //  StringBuffer is mutable can be changed.
		System.out.print("This is StringBuffer: ");
		name1.append(" Mumbai");	// In StringBuffer we use .append to concatination.
		
		System.out.println(name1);
		
		
		// Length of String
		String city = new String("Ahmedabad");    
		System.out.print("This is the Length of String: ");
		System.out.print(city.length());  // Measuring the Length of String using .length() Method and for Array use length Method.
		
		
	
	}

}
