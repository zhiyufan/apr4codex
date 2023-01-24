package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        

        int N = piles.length;
        int [][] dp = new int[N][k+1];
        int [] sum = new int[N];
        sum[0] = piles[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + piles[i];
        }
        for (int i = 0; i < N; i++) {
            dp[i][0] = sum[i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[N-1][k];
    }

===================================================
    public static int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            Point origin = points[i];
            Map<Double, Integer> map = new HashMap<>();
            map.put((double) Integer.MIN_VALUE, 1);
            int dup = 0;
            for (int j = 0; j < points.length; j++) {
                if (j == i) {
                    continue;
                }
                if (points[j].x == origin.x && points[j].y == origin.y) {
                    dup++;
                    continue;
                }
                double slope = points[j].x == origin.x ? Integer.MAX_VALUE : (1.0 * (points[j].x - origin.x)) / (points[j].y-origin.y);
                if (map.containsKey(slope)) {
                    map.put(slope, map.get(slope) + 1);
                } else {
                    map.put(slope, 2);
                }
            }
            for (Integer num : map.values()) {
                max = Math.max(max, num + dup);
            }
        }
        return max;
    }
}