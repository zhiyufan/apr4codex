package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
        List<Integer>[] list = new ArrayList[milestones.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
            for (int j = i + 1; j < list.length; j++) {
                if (milestones[j] % milestones[i] == 0) {
                    list[i].add(j);
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