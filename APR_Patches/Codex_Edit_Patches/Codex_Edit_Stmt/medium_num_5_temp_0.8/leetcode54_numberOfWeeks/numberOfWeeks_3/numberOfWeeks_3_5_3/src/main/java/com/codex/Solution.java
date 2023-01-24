package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        long ret = 0;
        for (int i = 0; i < milestones.length; i++) {
            ret += milestones[i] / (milestones.length - i);
            if (milestones[i] % (milestones.length - i) > 0) ret++;
        }
        return ret;
    }

    
}