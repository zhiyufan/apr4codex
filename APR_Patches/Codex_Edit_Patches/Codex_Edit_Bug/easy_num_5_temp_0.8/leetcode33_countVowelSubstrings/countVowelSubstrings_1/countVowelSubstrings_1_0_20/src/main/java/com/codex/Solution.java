package com.codex;

import java.util.*;

public class Solution {
public class ReverseVowels {
	public static void main(String [] args) {
		String string = "hello";
		String s = new String(reverseVowels(string));
		System.out.println(s);
	}
	public static String reverseVowels(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			while (start < end && !vowels.contains(chars[start] + "")) {
				start++;
			}
			while (start < end && !vowels.contains(chars[end] + "")) {
				end--;
			}
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		return new String(chars);
	}
}
}