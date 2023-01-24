package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.Map;

    public static int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int steps = 0;
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }

    
}