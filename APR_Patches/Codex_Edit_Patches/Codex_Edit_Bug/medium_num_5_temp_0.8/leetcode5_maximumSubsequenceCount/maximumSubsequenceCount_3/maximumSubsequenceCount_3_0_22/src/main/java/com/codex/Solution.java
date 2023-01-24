package com.codex;

import java.util.*;

public class Solution {
public class MaximumSubsequence {

	public static void main(String[] args) {
		System.out.println(maximumSubsequenceCount("12212","22"));
	}
	
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        int patternLength = pattern.length();
        for (int i = 0; i < text.length(); i++) {
        	if (i+patternLength<=text.length()) {
        		if (text.substring(i, i+patternLength).equals(pattern)) res++;
            }
        	
        }
        return res;
    }
}
}