package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
        if (milestones.length == 0) return 0;
        long result = Long.MAX_VALUE;
        long[] leftToRight = new long[milestones.length];
        long[] rightToLeft = new long[milestones.length];
        long sum = 0;
        for (int i = 0; i < milestones.length; i++) {
            sum += milestones[i];
            leftToRight[i] = sum;
        }
        return ret;
    }

    
}