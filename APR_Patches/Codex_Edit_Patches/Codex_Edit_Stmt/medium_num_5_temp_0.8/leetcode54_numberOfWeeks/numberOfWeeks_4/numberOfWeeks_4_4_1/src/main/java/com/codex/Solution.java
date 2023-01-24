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
        for (int i = 0; i < milestones.length; i++) {
            list.get(i).add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, new ArrayList<>(new HashSet<>(list.get(i))));
        }
        for (int i = 0; i < milestones.length; i++) {
            Collections.sort(list.get(i));
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 1; j < list.get(i).size(); j++) {
                list.get(i).set(j, list.get(i).get(j) - list.get(i).get(j - 1) - 1);
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