package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] + words[j] == target) ans++;
                if (words[j] + words[i] == target) ans++;
            }
        }
        return ans;
    }

    
}