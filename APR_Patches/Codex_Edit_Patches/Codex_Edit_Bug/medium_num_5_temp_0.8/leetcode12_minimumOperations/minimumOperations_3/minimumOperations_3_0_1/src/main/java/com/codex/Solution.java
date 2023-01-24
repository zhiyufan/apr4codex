package com.codex;

import java.util.*;

public class Solution {
public static int minimumOperations(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int[][][] dp = new int[len][2][2];
        dp[0][0][0] = 0;
        dp[0][0][1] = 1;
        dp[0][1][0] = dp[0][1][1] = 1;
        for (int i = 1; i < len; i++) {
            // dp[i][0][0] = dp[i][0][1] = dp[i][1][0] = dp[i][1][1] = Integer.MAX_VALUE;
            for(int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (j == 1 && k == 0) {
                        continue;
                    }
                    dp[i][j][k] = Integer.MAX_VALUE;
                    if (j == 0) {
                        dp[i][j][k] = Math.min(dp[i][j][k], dp[i-1][j][k]);
                        if (nums[i] != nums[i-1]) {
                            dp[i][j][k] = Math.min(dp[i][j][k], dp[i-1][j][k] + 1);
                        }
                        
                        if (i >= 2 && nums[i] == nums[i-2]) {
                            dp[i][j][k] = Math.min(dp[i][j][k], dp[i-1][1][k] + 1);
                        }
                        
                    } else {
                        dp[i][j][k] = Math.min(dp[i][j][k], dp[i-1][j][k] + 1);
                        dp[i][j][k] = Math.min(dp[i][j][k], dp[i-1][j][k] + 1);
                    }
                    
                }
            }
        }
        return Math.min(dp[len-1][0][1], dp[len-1][1][1]);
    }

    
}