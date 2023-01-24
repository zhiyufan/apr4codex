package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {
	HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	int result = 0;
	for (int i = 0; i < word.length(); i++) {
		String s = "";
		for (int j = i; j < word.length(); j++) {
			s += word.charAt(j);
			boolean hasAllVowels = true;
			for (Character vowel : vowels) {
				if (!s.contains(vowel.toString())) {
					hasAllVowels = false;
				}
				if (!hasAllVowels) {
					break;
				}
			}
			if (hasAllVowels) {
				result++;
			}
		}
		
	}
	return result;
}
}