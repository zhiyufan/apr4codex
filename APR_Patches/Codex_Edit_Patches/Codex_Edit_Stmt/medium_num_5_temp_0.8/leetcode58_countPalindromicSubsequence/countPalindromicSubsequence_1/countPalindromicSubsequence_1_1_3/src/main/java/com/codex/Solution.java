package com.codex;

import java.util.*;

public class Solution {
        int count = 0;

        int[][] dp = new int[s.length()][s.length()];
                int left = 0;
                int right = 0;
                int leftUp = 0;
                int rightDown = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;   
                } else if (s.charAt(i) != s.charAt(j)){
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
                } else if (i + 1 == j) {
                    dp[i][j] = 2;
                } else {
                    left = dp[i+1][j-1];
                    right = dp[i][j-1];
                    leftUp = dp[i+1][j];
                    dp[i][j] = left + 1 + right - leftUp;
                }
            }
        }

        return dp[0][s.length()-1];
    }

    
}