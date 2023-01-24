package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public long numberOfWeeks(int[] milestones) {
        // Write your solution here
        long[] dp = new long[milestones.length];
        long[] sum = new long[milestones.length];
        Arrays.fill(dp, Long.MAX_VALUE);
        for (int i = 0; i < milestones.length; i++) {
            dp[i] = milestones[i];
            sum[i] = milestones[i];
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(milestones[0], 0);
        for (int i = 0; i < milestones.length; i++) {
            for(Map.Entry<Integer, Integer> e : map.entrySet()) {
                if(e.getKey() % milestones[i] == 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[e.getValue()]);
                }
            }
        }
        for (int i = 1; i < milestones.length; i++) {
            sum[i] = sum[i - 1] + milestones[i];
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