package com.codex;

import java.util.*;

public class Solution {
public static int countPalindromicSubsequence(String s) {
    
    
    int[][] dp = new int[s.length()][s.length()];
    
    for (int i = 0; i < s.length(); i++) {
        for (int j = i; j < s.length(); j++) {
            if (i == j) {
                dp[i][j] = 1;
            } else if (s.charAt(i) == s.charAt(j)) {
                dp[i][j] = dp[i+1][j-1] + 2;
            } else {
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
            }
        }
    }
    
    return dp[0][s.length()-1];
}


s = 0   1    2    3    4    5   6   7
0 [[1, 1, 1, 1, 3, 3, 3, 3], 
1  [0, 1, 1, 3, 3, 3, 3, 3], 
2  [0, 0, 1, 1, 1, 3, 3, 3], 
3  [0, 0, 0, 1, 1, 1, 1, 3], 
4  [0, 0, 0, 0, 1, 1, 1, 1], 
5  [0, 0, 0, 0, 0, 1, 1, 1], 
6  [0, 0, 0, 0, 0, 0, 1, 1], 
7  [0, 0, 0, 0, 0, 0, 0, 1]]

}