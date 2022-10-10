package com.day20;
import java.util.ArrayList;

import java.util.Collections;




public class CollectionSorting {

	public static void main(String[] args) {
		
		 // Create a list of strings
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Prakash");
        list.add("Rahul");
        list.add("Krishna");
        list.add("Vishal");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(list);
 
        // Let us print the sorted list
        System.out.print("List after the use of" + " Collection.sort() :\n" + list);
		
	}

}
