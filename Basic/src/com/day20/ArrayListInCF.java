package com.day20;
import java.util.Collections;
import java.util.ArrayList;


public class ArrayListInCF {

	public static void main(String[] args) {
	
		// Creating ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Mohit");
		list.add("Ajay");
		list.add("Vijay");
		
		System.out.println(list);
		
		// collction sorting by using Collections.sort();
		Collections.sort(list);
		System.out.println(list);
		
		

		
		
	
	}

}