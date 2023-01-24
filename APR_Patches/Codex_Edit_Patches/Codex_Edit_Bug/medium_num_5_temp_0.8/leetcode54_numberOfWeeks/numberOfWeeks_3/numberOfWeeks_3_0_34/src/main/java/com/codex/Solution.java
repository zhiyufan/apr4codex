package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        Arrays.sort(milestones);
        long result = 0;
        for (int i = milestones.length - 1; i > 0; i--) {
            result += milestones[i] / (milestones.length - i);
            if (milestones[i] % (milestones.length - i) != 0) result++;
        }
        return result;
    }
}