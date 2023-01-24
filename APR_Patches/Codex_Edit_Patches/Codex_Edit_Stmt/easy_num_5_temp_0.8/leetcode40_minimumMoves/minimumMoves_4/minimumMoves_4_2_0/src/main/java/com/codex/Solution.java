package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        if (sChar[0] == sChar[1] && sChar[1] == sChar[2]) {
            dp[0] = sChar[0] == 'X'? 0 : 1;
        }
        else if (sChar[0] == sChar[1] && sChar[1] != sChar[2]) {
            dp[0] = sChar[0] == 'X'? 1 : 0;
        } else {
            dp[0] = 0;
        }
        dp[1] = dp[0];
        for (int i = 2; i < sChar.length - 1; i++) {
            if (sChar[i] == sChar[i-1] && sChar[i-1] == sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 0 : 1;
            } else if (sChar[i] == sChar[i-1] && sChar[i-1] != sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 1 : 0;
            } else if (sChar[i] == sChar[i-2]) {
                dp[i] = 0;
            }
            dp[i] += dp[i-1];
        }
        if (sChar[sChar.length-2] == sChar[sChar.length-1] && sChar[sChar.length-1] == sChar[sChar.length-3]) {
            dp[dp.length-1] = sChar[sChar.length-2] == 'X'? 0 : 1;
        } else if (sChar[sChar.length-2] == sChar[sChar.length-1] && sChar[sChar.length-1] != sChar[sChar.length-3]) {
            dp[dp.length-1] = sChar[sChar.length-2] == 'X'? 1 : 0;
        } else if (sChar[sChar.length-1] == sChar[sChar.length-3]) {
            dp[dp.length-1] = 0;
        }
        if (dp.length > 1) {
            dp[dp.length-1] += dp[dp.length-2];
        }
        return dp[dp.length-1];
    }

    
}