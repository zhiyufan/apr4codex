package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        if (sChar[0] == sChar[1]) {
            dp[0] = 1;
        } else {
            dp[0] = 0;
        }
        dp[0] = Math.min(dp[0], sChar[0] != sChar[1]? 1:0);
        dp[1] = dp[0];
        for (int i = 1; i < sChar.length; i++) {
            dp[i] = Math.min(Math.min(dp[i-1], (i>2 ? dp[i-2]:0) + 1), sChar[i-1] != sChar[i]? 1:0);
        }
        return dp[dp.length-1];
    }

    
}