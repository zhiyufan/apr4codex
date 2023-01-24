package com.codex;

import java.util.*;

public class Solution {
  public static long numberOfWeeks(int[] milestones) {

        // dp[i] means the maximum number of weeks we can spend if we are at the i-th milestone
        long[] dp = new long[milestones.length];
        dp[0] = milestones[0];

        // loop through all milestones
        for (int i = 1; i < milestones.length; i++) {

            // loop through the previous milestones
            for (int j = i - 1; j >= 0; j--) {

                // check if we can go from the current milestone to the next one
                if (milestones[i] % milestones[j] == 0) {

                    // calculate how many weeks we can spend at the next milestone
                    dp[i] = Math.max(dp[i], dp[j] + milestones[i]);
                }
            }

            // we can always spend the current milestone
            dp[i] = Math.max(dp[i], milestones[i]);
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