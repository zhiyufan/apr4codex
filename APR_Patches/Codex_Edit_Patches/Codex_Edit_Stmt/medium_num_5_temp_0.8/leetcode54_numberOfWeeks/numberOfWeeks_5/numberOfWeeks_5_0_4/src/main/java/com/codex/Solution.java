package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        int result = 0;
        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }

	
	public static int isThisWeekend(int[] days) {
		int sunday = 0;
		int saturday = 0;
		for (int i = 0; i < days.length; i++) {
			if (days[i] == 0) {
				sunday++;
			} else if (days[i] == 6) {
				saturday++;
			}
		}
		return Math.max(sunday, saturday);
	}
    
}