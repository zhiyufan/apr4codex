package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) { 
        
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < changed.length; i++) {
            if (!set.add(changed[i])) {
                set.remove(changed[i]);
            }
        }

        return set.isEmpty() ? new int[0] : set.toArray(new int[1]);
    }

    
}