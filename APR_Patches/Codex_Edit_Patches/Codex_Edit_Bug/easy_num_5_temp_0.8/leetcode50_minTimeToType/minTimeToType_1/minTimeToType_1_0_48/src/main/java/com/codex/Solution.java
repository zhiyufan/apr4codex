package com.codex;

import java.util.*;

public class Solution {
    /**
	* This method calculates the minimum number of keystrokes needed to type a word
	* @param word : the word we want to type
	* @return : the minimum number of keystrokes needed
	*/
    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
    }
}