package com.day24;

import org.junit.jupiter.api.Test;

public class Task {
	
	//Method for Square of a Number.
		int square (int x) {
			return x*x;
		}
		
		
	// Method for counting A/a
		int countA (String word){
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				if( word.charAt(i) == 'a' || word.charAt(i) == 'A') {
					count++;
				}
					
			}
			return count;
		}
}
