package com.codex;

import java.util.*;

public class Solution {
	public static int minStepsUsingArray(String s, String t) {

		int[] letters = new int[26];
		int res = 0;
		for (char c : s.toCharArray()) {
			letters[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			letters[c - 'a']--;
		}
		for (int i : letters) {
			if (i > 0) {
				res += i;
			}
		}
		return res;
	}

    public static int minSteps(String s, String t) {

        Map<Character, Integer> charFreq = new HashMap<>();
        int res = 0;
        for (char c : s.toCharArray()) {
        	charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (charFreq.containsKey(c)) {
                int count = charFreq.get(c);
                if (count == 1) {
                    charFreq.remove(c);
                } else {
                    charFreq.put(c, count - 1);
                }
            } else {
                res++;
            }
        }
        return res;
    }

}
}