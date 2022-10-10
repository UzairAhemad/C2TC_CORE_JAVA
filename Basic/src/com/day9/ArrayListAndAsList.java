package com.day9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

 
public class ArrayListAndAsList {

	public static void main(String[] args) {
		
		List<String> citysname = new ArrayList<>();      // Creating Array List.
		citysname.add("Mumbai");	// This is element.
		citysname.add("Pune");
		citysname.add("Nashik");
		citysname.add("Nagpur");
		citysname.add("Thane");
		
		String[] city = {"Mumbai","Pune","Nashik","Nagpur","Thane"};  // Creating String Array.
		List<String> list = Arrays.asList(city); // "asList" is returning an Immutable ArrayList (Can't add any element).
		
		citysname.add("New Mumbai");  // Adding New Element Here in cityname.
		System.out.println(citysname); 
		
		list.add("New Mumbai");  // Adding New Element Here in city.
		System.out.println(list);
		

	}

}
