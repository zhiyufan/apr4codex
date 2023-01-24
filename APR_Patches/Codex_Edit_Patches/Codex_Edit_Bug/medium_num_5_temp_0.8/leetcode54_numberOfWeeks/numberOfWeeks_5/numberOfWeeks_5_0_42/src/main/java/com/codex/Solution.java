package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static long numberOfWeeks(int[] milestones) {
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i < 100; i++) {
            set.add(i);
        }        
        for (int i = 0; i < milestones.length; i++) {
            int tmp = milestones[i];
            for (int j = 0; j < 10; j++) {
                set.remove(tmp);
                tmp += milestones[i];
            }
        }
        return result;
    }

    
}