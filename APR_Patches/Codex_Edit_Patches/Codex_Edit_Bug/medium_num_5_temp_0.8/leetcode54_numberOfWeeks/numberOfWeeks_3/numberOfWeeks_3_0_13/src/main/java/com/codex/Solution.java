package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        long max = 0;
        long[] nums = new long[milestones.length];
        for (int i = 0; i < milestones.length; i++) {
            max = Math.max(max, milestones[i]);
            nums[i] = max / (milestones.length - i) + (max % (milestones.length - i) > 0 ? 1 : 0);
        }
        return nums[0];
    }

    
}