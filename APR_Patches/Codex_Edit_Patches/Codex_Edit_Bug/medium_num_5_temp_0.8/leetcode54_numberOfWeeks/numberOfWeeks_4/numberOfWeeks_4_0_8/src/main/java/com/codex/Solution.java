package com.codex;

import java.util.*;

public class Solution {
public static int numberOfWeeks(int[] milestones) {
        if (milestones.length == 0) return 0;
        int max = 0;
        for (int i = 0; i < milestones.length; i++)
            if (milestones[i] > max) max = milestones[i];

        int[] memo = new int[max + 1];
        memo[1] = 1;
        int maxWeeks = 0;
        for (int i = 1; i <= max; i++) {
            if (memo[i] == 0) continue;
            maxWeeks = Math.max(maxWeeks, memo[i]);
            for (int j = 0; j < milestones.length; j++) {
                if (i + milestones[j] <= max)
                    memo[i + milestones[j]] = Math.max(memo[i + milestones[j]], memo[i] + 1);
            }
        }

        for (int i = 0; i < milestones.length; i++)
            if (milestones[i] == max) return maxWeeks;

        return maxWeeks - 1;
    }   
}