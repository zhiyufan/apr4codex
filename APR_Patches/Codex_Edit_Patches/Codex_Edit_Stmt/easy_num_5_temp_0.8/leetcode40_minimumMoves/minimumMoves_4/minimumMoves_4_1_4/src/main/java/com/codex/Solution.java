package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()+1];
        char[] sChar = s.toCharArray();

        for (int i = 1; i <= sChar.length; i++) {
            if (i < 3) {
                dp[i] = 0;
            } else if (sChar[i-1] == sChar[i-2] && sChar[i-2] == sChar[i-3]) {
                dp[i] = sChar[i-1] == 'X'? 0 : 1;
            } else if (sChar[i-1] == sChar[i-2] && sChar[i-2] != sChar[i-3]) {
                dp[i] = sChar[i-1] == 'X'? 1 : 0;
            } else {
                dp[i] = 0;
            }
            dp[i] += dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[dp.length-1]%(Math.pow(10,9)+7);
    }

    
}