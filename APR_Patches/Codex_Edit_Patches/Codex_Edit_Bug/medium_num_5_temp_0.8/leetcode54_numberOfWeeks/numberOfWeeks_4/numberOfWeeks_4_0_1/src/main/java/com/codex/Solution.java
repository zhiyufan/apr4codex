package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < milestones.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                if (milestones[j] % milestones[i] == 0) {
                    list.get(i).add(j);
                }
            }
        }
        long[] dp = new long[milestones.length];
        dp[0] = milestones[0];
        for (int i = 1; i < milestones.length; i++) {
            for (int j = 0; j < i; j++) {
                if (milestones[j] == 0 || (milestones[i] % milestones[j] == 0)) {
                    dp[i] = Math.max(dp[i], dp[j] + milestones[i]);
                }
            }
            if (dp[i] == 0) {
                dp[i] = milestones[i];
            }
        }
        long max = 0;
        max = Arrays.stream(dp).max().getAsLong();
        return (max - 1) / 7 + 1;
    }
}