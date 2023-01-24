package com.codex;

import java.util.*;

public class Solution {
//Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
//
//        Return the minimum number of steps to make t an anagram of s.
//
//        An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.


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
}