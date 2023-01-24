package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static void main(String[] args) {
        int[] milestones = {1, 2, 3, 4, 6, 10, 15, 18, 21, 22, 23, 24, 25, 30, 35, 40};
        System.out.println(numberOfWeeks(milestones));
    }
    public static long numberOfWeeks(int[] milestones) {
        
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < milestones.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 1; i < milestones.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (milestones[i] % milestones[j] == 0) {
                    list.get(i).add(j);break;
                }
            }
        }
        long[] dp = new long[milestones.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = milestones[i];
        }
        for (int i = milestones.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < milestones.length; j++) { 
                boolean flag = false;
                for (int k : list.get(i)) {
                    if (k == j) {
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