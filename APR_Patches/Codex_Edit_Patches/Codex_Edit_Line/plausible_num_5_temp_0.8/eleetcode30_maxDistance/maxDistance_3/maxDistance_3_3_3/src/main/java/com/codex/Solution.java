package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;

	public static String longestSubstringKDistinct(String s, int k) {
		int[] count = new int[256]; // Assume ASCII
		int num = 0, i = 0, j = 0;
		for (i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)]++ == 0) 
				num++;
			if (num > k) {
				while (--count[s.charAt(j++)] > 0);
				num--;
			}
		}
		return s.substring(j, i);
	}
    }

    
}