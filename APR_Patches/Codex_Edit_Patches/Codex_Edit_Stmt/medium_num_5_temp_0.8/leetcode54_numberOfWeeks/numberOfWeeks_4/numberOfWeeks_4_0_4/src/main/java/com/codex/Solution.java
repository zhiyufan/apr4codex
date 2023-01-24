package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        List<List<Integer>> list = new ArrayList<>();
        // 这里在外层下标不用，但是需要和milestones的长度一致，所以直接赋值避免重复声明
        for (int i = 0; i < milestones.length; i++) {
            list.add(new ArrayList<>());
        }
        // 对于每一个点，找到它后面最近的能被整除的点，如果有被整除的点，就让其最近的被整除的点的值加上整除的点的值
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