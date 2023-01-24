package com.codex;

import java.util.*;

public class Solution {
    public static boolean isValid(int[] changed) {
        
        int count = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 != 0) {
                count++;
            }
        }
        if (count != 1) {
            return false;
        }
        return true;
    }
    
    
    
    
    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 != 0) {
                if (!set.isEmpty()) {
                    return new int[]{};
                }
            } else {
                if (set.contains(changed[i]/2)) {
                    set.remove(changed[i]/2);
                } else {
                    set.add(changed[i]/2);
                }
            }
        }
        if (!set.isEmpty()) {
            return new int[]{};
        }
        int k = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                original[k] = changed[i]/2;
                k++;
            }
        }
        return original;
    }


    
}