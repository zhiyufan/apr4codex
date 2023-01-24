package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!right.containsKey(colors[i]))
                right.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;





    public static int minimumStepsToMakeTwoStringsAnagram(String s, String t) {
        int[] hash = new int[26];

        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }
        

        for (char c : t.toCharArray()) {
            hash[c - 'a']--;
        }

        int ans = 0;
        for (int i : hash) {
            ans += Math.abs(i);
        }

        return ans / 2;
    }

     
    }

    
}