package com.codex;

import java.util.*;

public class Solution {
public static int minimumCost(int[] cost) {

    if (cost.length == 1) return cost[0];
    int[] dp = new int[cost.length];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 2; i < cost.length; i++) {
        dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
    }
    return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
}

/*
    要点：

    1. dp[1] = cost[1];
    
    这是两个房子的情况，dp[1]初始化为0，那么dp[n]都是0，所以两个房子的情况就不能正确处理。
*/

// 如果只有两个房子也不能正确处理，需要改成如下代码：

public static int minimumCost(int[] cost) {

    if (cost.length == 1) return cost[0];
    if (cost.length == 2) return Math.min(cost[0], cost[1]);
    int[] dp = new int[cost.length];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 2; i < cost.length; i++) {
        dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
    }
    return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
}


// 改成从前往后的方法（节省空间）：

public int minCostClimbingStairs(int[] cost) {
    if (cost.length == 1) return cost[0];
    if (cost.length == 2) return Math.min(cost[0], cost[1]);
    int first = cost[0];
    int second = cost[1];
    for (int i = 2; i < cost.length; i++) {
        int temp = cost[i] + Math.min(first, second);
        first = second;
        second = temp;
    }
    return Math.min(first, second);
}


/*
    改成从后往前的方法（节省空间）：
    
    1. 如果i<2，则dp[i]=cost[i]，即前两步只需要初始化就可以。

    2. 如果i>=2，则dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2])，即每步需要知道下一步的情况。
*/


public int minCostClimbingStairs(int[] cost) {
    if (cost.length == 1) return cost[0];
    if (cost.length == 2) return Math.min(cost[0], cost[1]);
    int[] dp = new int[cost.length + 2];
    dp[cost.length] = 0;
    dp[cost.length - 1] = 0;
    for (int i = cost.length - 2; i >= 0; i--) {
        if (i < 2) {
            dp[i] = cost[i];
        } else {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }
    }

    return dp[0];
}
}