package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < changed.length; i++) {
            if (map.containsKey(changed[i]/2)) {
                map.remove(changed[i]/2);
            } else {
                if (changed[i] % 2 == 0) {
                    map.put(changed[i]/2, i);
                } else {
                    return new int[]{};
                }
            }
        }
        if (!map.isEmpty()) {
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