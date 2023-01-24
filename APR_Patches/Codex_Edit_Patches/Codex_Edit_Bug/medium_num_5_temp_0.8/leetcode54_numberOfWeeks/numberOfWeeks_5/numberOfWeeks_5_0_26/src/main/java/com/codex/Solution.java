package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        int result = 0;
        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }


     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[k];
        for (int i = 0; i < k; i++) {
            p[i] = sc.nextInt();
        }

        double result = building(n, m, a, b, p);
        System.out.println(result);
    }

    public static double building(int n, int m, int a, int b, int[] p) {
        double[][] dp = new double[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = Double.MAX_VALUE;
            }
        }
        dp[0][0] = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + a / b;
        }

        int temp = 0;
        for (int i = 0; i < p.length; i++) {
            temp += p[i];
            for (int j = 0; j < p[i]; j++) {
                for (int t = 1; t <= k; t++) {
                    if (j - t >= 0) {
                        dp[temp][t] = Math.min(a / (j - t) + dp[j - t][t - 1], dp[j][t]);
                    }
                }
            }
        }

        temp += m;
        double result = Double.MAX_VALUE;
        for (int i = 0; i <= k; i++) {
            result = Math.min(result, dp[temp][i]);
        }
        if (result == Double.MAX_VALUE) {
            return -1.0;
        }
        return Math.round(result * 1000.0) / 1000.0;
    }

    
}