package com.codex;

import java.util.*;

public class Solution {
// The idea is to count number of times all the characters appears. All the characters are not required to be converted. 
// Only characters that appear more times in 1st string than the second string need to be converted.
// count is the number of characters that appear more no of times in 1st string than the 2nd string
// eg. S = "bab" and T = "aba", count = 2 (1 'b' and 1 'a')
// 2bab-> 2aba-> 1bab-> 1aba

    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }

    
}