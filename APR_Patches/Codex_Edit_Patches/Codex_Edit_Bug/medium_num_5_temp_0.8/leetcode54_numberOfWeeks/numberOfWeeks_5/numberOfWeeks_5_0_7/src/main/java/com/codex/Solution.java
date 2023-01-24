package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones, int[] milestonesWeeks) {
        
        int result = 0;
        for (int i = 0; i < milestonesWeeks.length; i++) {
            int current = milestonesWeeks[i];
            for (int j = 0; j < milestones.length; j++) {
                int newMilestone = milestones[j];
                if (newMilestone < current && newMilestone > milestonesWeeks[i-1]) {
                    int sum = 0;
                    for (int k = i-1; k >= 0; k--) {
                        sum += milestonesWeeks[k];
                    }
                    sum += newMilestone;
                    result = Math.max(result, current - sum);
                }
            }
        }
        return result;
    }

    
}