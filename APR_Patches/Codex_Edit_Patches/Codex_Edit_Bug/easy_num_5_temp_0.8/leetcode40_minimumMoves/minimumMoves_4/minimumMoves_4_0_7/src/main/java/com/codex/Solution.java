package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {
        if (s.length() == 0 || s.length() == 1) return 0;
        if (s.length() == 2) return s.charAt(0) == s.charAt(1) ? 0 : 1;
        
        int[] dp = new int[s.length()+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = s.charAt(0) == s.charAt(1) ? 0 : 1;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = s.charAt(i-2) == s.charAt(i-1) ? dp[i-2] : dp[i-2] + 1;
            if (s.charAt(i-3) == s.charAt(i-1) && s.charAt(i-2) != s.charAt(i-1)) {
                dp[i] = Math.min(dp[i-1], dp[i-3] + 1);
            } else {
                dp[i] = Math.min(dp[i], dp[i-1]);
            }
        }
        if (s.charAt(s.length()-2) == s.charAt(s.length()-1)) {
            return Math.min(dp[s.length()-1], dp[s.length()-3]);
        }
        return dp[dp.length-1];        
    }
}