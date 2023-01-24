package com.codex;

import java.util.*;

public class Solution {
    
        
        int[][] dp = new int[nums.length][nums.length];

        int noOfPerm = 0;
        
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = i; j < dp.length; j++) {
                if (i == j)
                    dp[i][j] = 1;
                else if (i + 1 == j && Math.abs(nums[i] - nums[j]) <= num)
                    dp[i][j] = 2;
                else {
                    int localPerms = 0;
                    for (int k = i + 1; k < j; k++) {
                        if (Math.abs(nums[i] - nums[k]) <= num && Math.abs(nums[j] - nums[k]) <= num)
                            localPerms += dp[i][k] * dp[k][j];
                    }
                    dp[i][j] = localPerms + (dp[i+1][j-1]+1);
                }
                noOfPerm += dp[i][j];
            }

        }
        return noOfPerm;
    }
}