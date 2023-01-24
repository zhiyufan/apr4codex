package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
        int n = 10000;
        int[] dp = new int[n + 1];
        for (int i = 1; i < n; i++)
            dp[i] = Integer.MAX_VALUE - 1;
        for (int i = 0; i < milestones.length; i++)
            for (int j = 0; j <= milestones[i]; j++)
                if (dp[j] != Integer.MAX_VALUE)
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
        return dp[n];
}
}