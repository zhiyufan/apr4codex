package com.codex;

import java.util.*;

public class Solution {
 public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        while (idx < changed.length) {
            if (changed[idx] % 2 == 0) {
                if (set.contains(changed[idx]/2)) {
                    set.remove(changed[idx]/2);
                } else {
                    set.add(changed[idx]/2);
                }
            } else {
                return new int[]{};
            }
            idx++;
        }

        if (!set.isEmpty()) {
            return new int[]{};
        }
        idx = 0;
        int i = 0;
        while (idx < changed.length) {
            if (changed[idx] % 2 == 0) {
                original[i] = changed[idx]/2;
                i++;
            }
            idx++;
        }
        return original;
    }


    
}