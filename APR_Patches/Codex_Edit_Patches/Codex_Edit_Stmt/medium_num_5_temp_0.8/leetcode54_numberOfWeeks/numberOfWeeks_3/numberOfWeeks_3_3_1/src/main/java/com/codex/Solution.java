package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        Arrays.sort(milestones);
        long ret = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i; j >= 0; j--) {
                ret += milestones[i] / (milestones.length - j);
                if (milestones[i] % (milestones.length - j) != 0) ret++;
            }
        }
        return ret;
    }

    
}