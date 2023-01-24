package com.codex;

import java.util.*;

public class Solution {


    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()];
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
            dp[0] = s.charAt(0) == 'X'? 0 : 1;
        }
        else if (s.charAt(0) == s.charAt(1) && s.charAt(1) != s.charAt(2)) {
            dp[0] = s.charAt(0) == 'X'? 1 : 0;
        } else {
            dp[0] = 0;
        }
        dp[1] = dp[0];
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1) && s.charAt(i-1) == s.charAt(i-2)) {
                dp[i] = s.charAt(i) == 'X'? 0 : 1;
            } else if (s.charAt(i) == s.charAt(i-1) && s.charAt(i-1) != s.charAt(i-2)) {
                dp[i] = s.charAt(i) == 'X'? 1 : 0;
            } else {
                dp[i] = 0;
            }
            dp[i] += dp[i-1];
        }
        return dp[s.length()-1];
    }

    
}