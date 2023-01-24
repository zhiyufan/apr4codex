package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) { 
        if (cost == null || cost.length <= 1) {
            return 0; 
        }
        int n = cost.length;
        int[][] dp = new int[n][3];
        for (int i = 0; i < 3; ++i) {
            dp[0][i] = cost[0];
        }
        for (int i = 1; i < n; ++i) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i];
        }
        return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));

        // if (cost == null || cost.length == 0) {
        //     return 0;
        // }
        // int min = Integer.MAX_VALUE;
        // int secondMin = Integer.MAX_VALUE;
        // int res = 0;
        // for (int i = 0; i < cost.length; ++i) {
        //     int curCost = cost[i];
        //     if (curCost <= min) {
        //         secondMin = min;
        //         min = curCost;
        //     } else if (curCost < secondMin) {
        //         secondMin = curCost;
        //     }
        //     res += (i % 2 == 0 ? min : secondMin);
        // }
        // return res;
    }

    public static int minimumCost2(int[] cost) {
        int n = cost.length;
        if (n <= 1) {
            return 0; 
        }
        int[][] dp = new int[n][3];
        for (int i = 0; i < 3; ++i) {
            dp[0][i] = cost[0];
        }
        for (int i = 1; i < n; ++i) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i];
        }
        return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
    }

    public static int minimumCost1(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0; 
        }
        int n = cost.length;
        int[] dp = new int[3];
        Arrays.fill(dp, cost[0]);
        for (int i = 1; i < n; ++i) {
            int prevA = dp[0];
            int prevB = dp[1];
            int prevC = dp[2];
            dp[0] = Math.min(prevB, prevC) + cost[i];
            dp[1] = Math.min(prevA, prevC) + cost[i];
            dp[2] = Math.min(prevA, prevB) + cost[i];
        }
        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }


    public static void main(String args[]) {
        int[] tst = {3,3,3,3,3,3,3,3,3};
        int[] tst2 = {1,2,5,5,5};
        System.out.println(tst.length);
        System.out.println(minimumCost2(tst2));
        test(tst2, 3);
        test(tst, 2);
    }

    private static void test(int[] tst, int expected) {
        int result = minimumCost2(tst);
        if (result != expected) {
            System.out.println("Result: " + result + "; Expected: " + expected);
            } else {
                System.out.println("Passed: " + result);
            }
        }
        return res;
    }
}