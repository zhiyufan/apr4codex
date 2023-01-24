package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        int[] tmp = new int[milestones.length];
        for (int i = 0; i < milestones.length; i++) tmp[i] = milestones[i];

        Arrays.sort(milestones);
        long ret = 0;
        for (int i = milestones.length - 1; i >= 0; i--) {
            ret += tmp[i] / (milestones.length - i);
            if (tmp[i] % (milestones.length - i) != 0) ret++;
        }
        return ret;
    }

    
}