package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        dp[0] = 0;
        if (sChar.length > 1) {
            if (sChar[0] == sChar[1]) {
                dp[1] = 0;
            } else {
                dp[1] = 1;
            }
        }
        if (sChar.length > 2) {
            if (sChar[1] == sChar[2] && sChar[2] != sChar[0]) {
                dp[2] = dp[1];
            } else {
                dp[2] = dp[1] + 1;
            }
            dp[i] += dp[i-1];
        }
        return dp[dp.length-1];
    }

    
}