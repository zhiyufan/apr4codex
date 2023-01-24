package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
	    
	boolean streetValid = true;
	int bucketCount = 0;
	for (int i = 0; i < street.length() - 1; i++) {
		if(street.charAt(i) == 'H') {
			if(street.charAt(i + 1) == 'H') {
				streetValid = false;
			}
			bucketCount++;
		}
	}
	
	if(street.charAt(street.length() - 1) == 'H') bucketCount++;
	
	return streetValid ? bucketCount : -1;
}

    
}