package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(String leaves) {
        
        
        int n = leaves.length();
        int[] dp = new int[n + 1];
        dp[1] = (leaves.charAt(0) == 'y') ? 1 : 0;
        dp[2] = (leaves.charAt(1) == 'y') ? 1 : 0;
        for (int i = 3; i <= n; i++){
            char ch = leaves.charAt(i - 1);
            dp[i] = dp[i - 1] + 1;
            if(ch == 'r'){
                dp[i] = Math.min(dp[i], dp[i - 1] + 1);
            }else{
                dp[i] = Math.min(dp[i - 1] + 1 + (leaves.charAt(i - 2) == 'r' ? 0 : 1), dp[i]);
            }
        }
        return dp[n - 1];
    }

    
}