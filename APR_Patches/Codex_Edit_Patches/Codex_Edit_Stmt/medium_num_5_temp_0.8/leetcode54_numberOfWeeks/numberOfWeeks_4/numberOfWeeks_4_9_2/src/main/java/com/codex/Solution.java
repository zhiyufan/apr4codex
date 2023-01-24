package com.codex;

import java.util.*;

public class Solution {
        /**
         * 项目技术经理编号从1开始，第i个项目技术经理要完成的项目有milestones[i]个，
         * 现在要建立单一职责原则，使得每个项目技术经理负责的项目横跨的周数尽量一致
         * @param milestones milestones数组
         * @return 项目周数
         */
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
        long[] dp = new long[milestones.length + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = milestones[i-1];
        }        
        for (int i = 0; i < milestones.length+1; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                for(int k : list.get(i)) {
                    dp[j] = Math.max(dp[j], dp[i] + milestones[j-1]);
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