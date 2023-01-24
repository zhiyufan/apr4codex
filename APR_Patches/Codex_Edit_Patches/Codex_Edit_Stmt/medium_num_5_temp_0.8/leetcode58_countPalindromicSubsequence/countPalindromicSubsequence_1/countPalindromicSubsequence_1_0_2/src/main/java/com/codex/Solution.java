package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        int count = 0;

        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if(i==j){
                    dp[i][j] = 1; 
                    count++;
                }
                else if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] + 2; 
                    count++;
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]); 
                    count++;
                }
            }
        }

        return count;
    }

    
}