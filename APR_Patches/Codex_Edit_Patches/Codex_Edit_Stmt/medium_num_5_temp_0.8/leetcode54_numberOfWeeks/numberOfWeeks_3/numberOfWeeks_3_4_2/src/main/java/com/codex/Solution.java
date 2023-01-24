package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        Arrays.sort(milestones);
        double ret = 0;
        for (int i = milestones.length - 1; i >= 0; i--) {
            ret += (double)milestones[i] / (milestones.length - i);
        }
        return (long)ret;
    }

    
}