package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static long numberOfWeeks(int[] milestones) {
        
        Arrays.sort(milestones);//[1,2,3,4,5,6,7,8,9]
        long ret = 0;
        for (int i = milestones.length - 1; i >= 0; i--) {
            //i=8 ret=0
            ret += milestones[i] / (milestones.length - i);
            if (milestones[i] % (milestones.length - i) != 0) ret++;
        }
        return ret;
    }

    
}