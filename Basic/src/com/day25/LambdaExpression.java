package com.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		l.addAll(Arrays.asList(15,25,25,75,56,63,28,79,23,58,27));
		System.out.println("Original List: " + l);
		
		List<Integer> evenList = new ArrayList();
		for(Integer i:1) {
			if(i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println("Even Number From the Collection: " + evenList);
		
		

	}

}

