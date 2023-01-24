package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {

        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        dp[0] = 0;
        if (sChar.length > 1) dp[1] = 0;
        for (int i = 1; i < sChar.length; i++) {
            if (sChar[i] == sChar[i-1]) {
                dp[i+1] = dp[i];
            } else {
                dp[i+1] = dp[i] + 1;
            }
            dp[i] += dp[i-1];
        }
        return dp[dp.length-1];
    }

    
}