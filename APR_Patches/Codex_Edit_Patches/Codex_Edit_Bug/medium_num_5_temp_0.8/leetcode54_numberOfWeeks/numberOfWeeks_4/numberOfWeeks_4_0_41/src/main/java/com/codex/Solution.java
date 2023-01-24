package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] arr = new long[n];
        long[] dp = new long[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    public static long numberOfWeek(int[] milestones) {
        
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