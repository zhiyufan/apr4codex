package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {

	int count = 0;
	for (int i = 0; i < word.length(); i++) {
		for (int j = i; j < word.length(); j++) {
			String sub = word.substring(i, j + 1);
			if (containsVowels(sub)) {
				count++;
			}
		}
	}
	return count;
}

    
}