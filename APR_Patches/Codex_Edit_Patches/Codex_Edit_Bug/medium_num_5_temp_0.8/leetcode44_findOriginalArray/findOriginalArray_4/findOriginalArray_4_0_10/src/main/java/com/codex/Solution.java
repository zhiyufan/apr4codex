package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        HashSet<Integer> remainingSet = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            if (!remainingSet.contains(changed[i]/2)) {
                if (changed[i] % 2 == 0) {
                    remainingSet.add(changed[i]/2);
                } else {
                    return new int[]{};
                }
            }
        }
        if (!remainingSet.isEmpty()) {
            return new int[]{};
        }
        int index = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                original[index] = changed[i]/2;
                index++;
            }
        }
        return original;
    }


    
}