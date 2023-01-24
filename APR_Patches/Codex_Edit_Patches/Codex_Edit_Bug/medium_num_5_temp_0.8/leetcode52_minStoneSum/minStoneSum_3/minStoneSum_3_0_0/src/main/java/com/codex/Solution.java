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


    public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int M = nums1.length;
        int N = nums2.length;
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0] - a[1] + b[1]);
        List<int[]> res = new ArrayList<>();
        if (M == 0 || N == 0) {
            return res;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                q.offer (new int[] {nums1[i], nums2[j]});
            }
        }
        int counter = 0;
        while (counter < k && !q.isEmpty()) {
            res.add(q.poll());
            counter++;
        }
        return res;
    }
}