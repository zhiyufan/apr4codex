package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length / 2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= changed.length; i++) {
            if (map.containsKey(changed[i - 1] / 2)) {
                map.put(changed[i - 1] / 2, map.get(changed[i - 1] / 2) + 1);
            } else {
                if (changed[i] % 2 == 0) {
                    map.put(changed[i - 1] / 2, 1);
                } else {
                    return new int[]{};
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return new int[]{};
            }
        }
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            while (entry.getValue() > 0) {
                original[k] = entry.getKey();
                k++;
                entry.setValue(entry.getValue() - 2);
            }
        }
        if (k != changed.length / 2) {
            return new int[]{};
        }
        return original;
    }
    }


    
}