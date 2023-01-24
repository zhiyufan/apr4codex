package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones, int cur) {
        
        Arrays.sort(milestones);
        long ret = 0;
        for (int i = cur; i < milestones.length; i++) {
            ret += milestones[i] / (milestones.length - cur);
            if (milestones[i] % (milestones.length - cur) != 0) ret++;
        }
        return ret;
    }

    
}