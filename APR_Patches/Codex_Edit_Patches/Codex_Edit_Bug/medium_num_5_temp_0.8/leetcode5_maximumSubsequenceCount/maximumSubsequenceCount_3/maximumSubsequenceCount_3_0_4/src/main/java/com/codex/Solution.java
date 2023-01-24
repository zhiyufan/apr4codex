package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {
		long res = 0;
		if (pattern.length() == 2) {
			res = findPattern(text, pattern);
		}
		long temp = 0;
		for (int i = 2; i < pattern.length(); i++) {
			temp = temp + findPattern(text, pattern.substring(0, i));
		}
		res = temp;
		return res;
	}

	public static long findPattern(String text, String pattern) {
		long res = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == pattern.charAt(0)) {
				for (int j = i + 1; j < text.length(); j++) {
					if (text.charAt(j) == pattern.charAt(1)) {
						res += 1;
					}
				}
			}
		}
		return res;
	}
}