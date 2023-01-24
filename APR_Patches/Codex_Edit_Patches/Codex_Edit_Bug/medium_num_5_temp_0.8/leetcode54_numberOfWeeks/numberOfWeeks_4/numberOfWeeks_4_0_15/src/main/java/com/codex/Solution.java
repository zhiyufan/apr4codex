package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
    int[] dp = new int[milestones.length];
    int max = 0;
    for (int i = 0; i < milestones.length; i++) {
        dp[i] = milestones[i];
        if (i != 0) {
            for (int j = 0; j < i; j++) {
                if (milestones[i] % milestones[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + milestones[i]);
                }
            }
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                if (milestones[j] % milestones[i] == 0) {
                    list.get(i).add(j);
                }
            }
        }
        long[] dp = new long[milestones.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = milestones[i];
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                for(int k : list.get(i)) {
                    if(k == j) {
                        continue;
                    }
                    dp[j] = Math.max(dp[j], dp[i] + milestones[j]);
                }
            }
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return (max - 1) / 7 + 1;
    }
}