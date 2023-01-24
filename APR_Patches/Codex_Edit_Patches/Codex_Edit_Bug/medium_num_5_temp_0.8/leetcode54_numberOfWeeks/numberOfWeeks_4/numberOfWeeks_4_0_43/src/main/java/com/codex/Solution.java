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
        dp[milestones.length - 1] = milestones[milestones.length - 1];
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length - 1; j++) {
                for(int k : list.get(i)) {
                    if(k == j) {
                        continue;
                    }
                    dp[i] = Math.max(dp[i], dp[k] + milestones[i]);
                }
            }
            if(dp[i] == 0) {
                dp[i] = milestones[i];
            }
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return (max - 1) / 7 + 1;
    }
}