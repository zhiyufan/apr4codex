package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        String[] n = nums.clone();
        Arrays.sort(n);
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.valueOf(n[j] + n[i]) == Integer.valueOf(target)) ans++;
            }
        }
        return ans;
    }

    
}