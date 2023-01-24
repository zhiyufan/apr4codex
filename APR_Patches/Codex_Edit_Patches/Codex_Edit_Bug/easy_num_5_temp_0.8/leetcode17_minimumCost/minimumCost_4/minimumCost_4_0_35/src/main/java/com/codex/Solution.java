package com.codex;

import java.util.*;

public class Solution {
//compare the min and min 2, then add the min 2
public int minCostII(int[][] costs) {
    if (costs == null || costs.length == 0) {
        return 0;
    }
    int len = costs.length;
    int k = costs[0].length;
    int[] dp = new int[k];
    int min1 = 0;
    int min2 = 0;
    for (int i = 0; i < len; i++) {
        int tempmin1 = Integer.MAX_VALUE;
        int tempmin2 = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            if (dp[j] < min1) {
                tempmin2 = Math.min(tempmin2, dp[j]);
            } else {
                tempmin2 = Math.min(tempmin2, min1);
            }
            dp[j] = costs[i][j] + (dp[j] == min1 ? min2 : min1);
            if (dp[j] < tempmin1) {
                tempmin2 = tempmin1;
                tempmin1 = dp[j];
            } else if (dp[j] < tempmin2) {
                tempmin2 = dp[j];
            }
        }
        min1 = tempmin1;
        min2 = tempmin2;
    }
    return min1;
}
}