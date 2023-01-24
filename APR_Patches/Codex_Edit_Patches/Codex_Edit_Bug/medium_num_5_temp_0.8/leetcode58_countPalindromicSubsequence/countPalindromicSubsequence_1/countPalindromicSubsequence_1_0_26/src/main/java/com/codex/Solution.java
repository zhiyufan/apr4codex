package com.codex;

import java.util.*;

public class Solution {
public static int countPalindromicSubsequence(String s) {
    int n = s.length();
    if (n == 0)
        return 0;
    int[][] dp = new int[n][n];
    
    for (int i = 0; i < n; i++) 
        dp[i][i] = 1;
    for (int length = 2; length <= n; length++) {
        for (int i = 0; i < n - length + 1; i++) {
            int j = i + length - 1;
            if (s.charAt(i) == s.charAt(j) && length == 2)
                dp[i][j] = 2;
            else if (s.charAt(i) == s.charAt(j))
                dp[i][j] = dp[i + 1][j] + dp[i][j - 1] + 1;
            else
                dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
        }
    }
        

    return dp[0][n - 1];
}    

    
}