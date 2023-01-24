package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones, int[] weeklyHours) {
        
        int result = 0;
        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        if (milestones.length == 0) {
            return 0l;
        }
        if (weeklyHours.length == 0) {
            weeklyHours = new int[milestones.length];
            for (int i = 0; i < milestones.length; i++) {
                weeklyHours[0] = 1;
            }
        }

        for (int i = 0; i < milestones.length; i++) {
            for (int j = milestones[i] - 1; j >= 0; j--) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[j + weeklyHours[i]] = Math.min(dp[j] + 1, dp[j + weeklyHours[i]]);
                }
            }
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] milestones = new int[N];
        for (int i = 0; i < N; i++) {
            milestones[i] = sc.nextInt();
        }

        int[] weeklyHours = new int[M];
        for (int i = 0; i < M; i++) {
            weeklyHours[i] = sc.nextInt();
        }

        System.out.println(numberOfWeeks(milestones, weeklyHours));
    }
}