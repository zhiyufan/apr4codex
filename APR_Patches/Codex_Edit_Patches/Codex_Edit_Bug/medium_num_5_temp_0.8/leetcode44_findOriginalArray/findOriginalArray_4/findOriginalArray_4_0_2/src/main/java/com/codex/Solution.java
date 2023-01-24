package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        int[] original = new int[changed.length];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                if (set.contains(changed[i] / 2)) {
                    set.remove(changed[i] / 2);
                } else {
                    set.add(changed[i] / 2);
                    original[i] = changed[i] / 2;
                }
            } else {
                original[i] = changed[i];
            }
        }
        if (!set.isEmpty()) {
            return new int[0];
        }

        return original;
    }


    
}