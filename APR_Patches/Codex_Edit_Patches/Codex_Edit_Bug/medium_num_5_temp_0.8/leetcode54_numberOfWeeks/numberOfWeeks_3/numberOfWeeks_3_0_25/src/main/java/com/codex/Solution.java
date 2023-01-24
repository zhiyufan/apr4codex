package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones){
        
        Arrays.sort(milestones, Comparator.reverseOrder());
        
        long ret = 0;
        
        for (int i = 0; i < milestones.length; i++){
            ret += milestones[i] / (i + 1);
            if (milestones[i] % (i + 1) != 0) ret++;
        }
        
        return ret;
    }

    
}