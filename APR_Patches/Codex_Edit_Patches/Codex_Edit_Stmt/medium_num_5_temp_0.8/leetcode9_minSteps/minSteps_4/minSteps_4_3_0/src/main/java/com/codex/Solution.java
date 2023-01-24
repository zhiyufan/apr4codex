package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int steps = 0;
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) {    // 用于两个数组比较,将短数组中含有,但长数组中没有的元素计数.
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }

    
}