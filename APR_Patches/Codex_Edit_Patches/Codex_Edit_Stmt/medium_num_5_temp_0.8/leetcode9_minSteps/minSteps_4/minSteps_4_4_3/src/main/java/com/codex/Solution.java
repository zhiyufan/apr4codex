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
            if (freq[c - 'a'] == 0) {
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }
public int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        int[] pre = new int[n];
        int[] dp = new int[1 << n];
        // Arrays.fill(dp, (int)1e9);
        
       
        for(int[] d : dependencies) {
            pre[d[1] - 1] |= 1 << (d[0] - 1);
        }
        dp[0] = 0;
        for (int i = 0; i < (1 << n); i++) {
            int temp = i;
            int count = 0;
            while (temp > 0) {
                if ( (temp & 1) != 0) {
                    count++;
                }
                temp >>= 1;
            } 
            if (count > k) continue;
            for (int j = 0; j < n; j++) {
                if (((i & (1 << j)) == 0) && ((i & pre[j]) == pre[j])) {
                    dp[i | (1 << j)] = Math.min(dp[i | (1 << j)], dp[i] + 1);
                }
            }
        }
        
        return dp[(1 << n) - 1];
    }

    
}