package com.codex;

import java.util.*;

public class Solution {
	static int countVowelSubstrings(String word) {
		List<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (vowels.contains(word.charAt(i))) {
				count = count + word.length() - i;
				System.out.println(count);
			}
		}

		return count;
	}
}