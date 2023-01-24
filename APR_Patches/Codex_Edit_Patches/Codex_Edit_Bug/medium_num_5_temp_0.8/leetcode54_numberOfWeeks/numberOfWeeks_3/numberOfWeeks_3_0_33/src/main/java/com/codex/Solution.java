package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {

        if (milestones.length == 0) return 0;
        
        Arrays.sort(milestones);
        long ret = 0;
        
        for (int i = milestones.length - 1; i >= 1; i--) {
        
            ret += (long)Math.ceil((double)(milestones[i] - milestones[i - 1]) / (milestones.length - i + 1));
        }
        return ret;
    }

    
}