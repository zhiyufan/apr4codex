package com.codex;

import java.util.*;

public class Solution {
// public class Solution {
//     public int minCost(int[] costs) {
//         if (costs == null || costs.length == 0) {
//             return 0;
//         }
//         int len = costs.length;
//         int[] dp = new int[len];
//         dp[0] = costs[0];
//         dp[1] = Math.min(dp[0], costs[1]);
//         dp[2] = Math.min(dp[0] + costs[2], dp[1] + costs[2]);
//         for (int i = 2; i < len; i++) {
//             dp[i] = Math.min(dp[i - 1], dp[i - 2]) + costs[i];
//         }
//         return dp[len - 1];
//     }
// }
}