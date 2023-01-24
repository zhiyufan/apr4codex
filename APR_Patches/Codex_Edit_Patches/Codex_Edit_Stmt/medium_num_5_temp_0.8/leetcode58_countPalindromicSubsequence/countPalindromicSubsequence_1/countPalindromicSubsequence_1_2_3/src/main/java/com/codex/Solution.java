package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        

        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    int k = i+1;
                    int l = j-1;
                    int inner = 0;
                    for (;k<=l;k++,l--) {
                        if (s.charAt(k) != s.charAt(l)) break;
                        inner++;
                    }
                    if (k>j) inner+=2;
                    dp[i][j] = inner;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return dp[0][s.length()-1];
    }

    
}