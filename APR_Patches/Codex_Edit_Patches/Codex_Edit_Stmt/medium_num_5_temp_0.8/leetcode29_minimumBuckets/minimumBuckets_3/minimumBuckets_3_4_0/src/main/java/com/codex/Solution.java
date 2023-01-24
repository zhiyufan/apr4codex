package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
		int count = 0;
		char[] street = in.toCharArray();
		
		// Loop over each character in the array
		for (int i = 0; i < street.length; i++) {
			
			// If the character is a hole
			if (street[i] == 'H') {
				
				// Check the left side of the left one back
				if (i - 1 >= 0) {
					if (street[i - 1] == '.') {
						count++;
					}
				}
				
				// Check the right side of the hole
				if (i + 1 < street.length) {
					if (street[i + 1] == '.') {
						count++;
					}
				}
			}
		}
		
		return count;
    }
}