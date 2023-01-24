package com.codex;

import java.util.*;

public class Solution {
    import java.util.HashMap;
    import java.util.Map;

    public static String findDifferentBinaryString(String[] nums) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    int oldCount = counts.getOrDefault(current[j], 0);
                    counts.put(current[j], oldCount + 1);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}