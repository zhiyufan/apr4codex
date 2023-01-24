package com.codex;

import java.util.*;

public class Solution {
    public static boolean contains( String haystack, String needle ) {
		
		if(haystack == null) {
			return false;
		}
		
		for(int i = 0; i <= haystack.length() - needle.length(); i++) {
			for(int j = 0; j < needle.length(); j++) {
				
				if(needle.charAt(j) != haystack.charAt(i + j)) {
					break;
				}
				
				if(j == needle.length() - 1) {
					return true;
				}
				
			}
		}
		
		return false;
	}
}