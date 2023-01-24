package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String input) {
        
        int[] hash = new int[26];
        for (int i = 0; i < input.length(); i++) {
            hash[input.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < hash.length; i++) {
            if ((hash[i] & (hash[i] - 1)) != 0) {
                count = count + (hash[i] & (hash[i] - 1));
            }
        }
        return step;
    }

    
}