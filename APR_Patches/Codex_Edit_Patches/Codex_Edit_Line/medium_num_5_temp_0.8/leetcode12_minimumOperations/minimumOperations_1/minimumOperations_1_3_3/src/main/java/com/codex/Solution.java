package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minimumOperations(String leaves) {
        char[] arr = leaves.toCharArray();
        int[][] dp = new int[3][arr.length];
        
        dp[0][0] = arr[0] == 'y' ? 1 : 0;
        
        dp[1][0] = dp[0][0];
        dp[1][1] = dp[1][0] + (arr[1] == 'y' ? 1 : 0);
        
        for(int j = 2; j < arr.length; j++) {
            dp[0][j] = dp[0][j - 1] + (arr[j] == 'r' ? 1 : 0);
            dp[1][j] = Math.min(dp[0][j - 1], dp[1][j - 1]) + (arr[j] == 'y' ? 1 : 0);
            dp[2][j] = Math.min(dp[1][j - 1], dp[2][j - 1]) + (arr[j] == 'r' ? 1 : 0); 
        }
        return dp[2][arr.length - 1];
    }

}
    
}