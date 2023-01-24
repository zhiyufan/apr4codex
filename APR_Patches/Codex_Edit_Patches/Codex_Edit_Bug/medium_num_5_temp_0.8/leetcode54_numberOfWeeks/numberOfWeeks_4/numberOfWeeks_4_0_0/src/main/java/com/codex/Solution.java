package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        Arrays.sort(milestones);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < milestones.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (milestones[i] % milestones[j] == 0) {
                    list.get(i).add(j);  
                }
            }
        }
        long[] dp = new long[milestones.length + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < milestones.length; i++) {
            for(int k : list.get(i)) {
                dp[i + 1] = Math.max(dp[k + 1] + 1, dp[i + 1]);
                System.out.println(dp[i + 1]);
            }
        }
        long max = 0;
        for (int i = 1; i < dp.length; i++) {
            if (dp[i] != Long.MIN_VALUE) {
                if (dp[i] > max) {
                    max = dp[i];
                }
            }
        }
        return (milestones[milestones.length - 1] * max - 1) / 7 + 1;
    }
}