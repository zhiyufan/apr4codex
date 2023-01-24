package com.codex;

import java.util.*;

public class Solution {
    public int minimumMoves(String s) {

        int[] dp = new int[s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            dp[i] = dp[i-1] + 1;
            if (i > 1 && s.charAt(i-2) == 'X' && s.charAt(i-1) == 'X') {
                dp[i] = Math.min(dp[i], dp[i-2] + 1);
            }
            if (i > 2 && s.charAt(i-3) == 'X' && s.charAt(i-2) == 'X' && s.charAt(i-1) == 'X') {
                dp[i] = Math.min(dp[i], dp[i-3] + 1);
            }
        }
        return dp[s.length()];
    }
}