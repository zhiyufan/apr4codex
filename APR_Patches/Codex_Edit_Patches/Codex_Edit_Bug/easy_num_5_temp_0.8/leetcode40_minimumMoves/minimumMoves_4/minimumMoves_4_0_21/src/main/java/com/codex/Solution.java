package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {
        
        int[] dp1 = new int[s.length()];
        int[] dp2 = new int[s.length()];
        char[] sChar = s.toCharArray();
        if (sChar[0] == sChar[1] ) {
            dp1[0] = sChar[0] == 'X'? 0 : 1;
        } else {
            dp1[0] = 0;
        }
        dp1[1] = dp1[0];
        for (int i = 2; i < sChar.length; i++) {
            if (sChar[i] == sChar[i-1] ) {
                dp1[i] = sChar[i] == 'X'? 0 : 1;
            } else {
                dp1[i] = 0;
            }
            dp1[i] += dp1[i-1];
            dp2[i] = dp2[i-1];
            if (i < sChar.length -1 && sChar[i] == sChar[i+1]) {
                dp2[i] += 1;
            }
        }
        return dp[dp.length-1];
    }

    
}