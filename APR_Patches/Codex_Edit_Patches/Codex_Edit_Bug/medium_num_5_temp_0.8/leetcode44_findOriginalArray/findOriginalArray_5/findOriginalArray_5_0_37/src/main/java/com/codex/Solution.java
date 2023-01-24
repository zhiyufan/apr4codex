package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] res = new int[changed.length / 2];

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            int count = cache.getOrDefault(num, 0);
            cache.put(num, count + 1);
        }

        int index = 0;
        for (int k : cache.keySet()) {
            int v = cache.get(k);
            if (v % 2 != 0) {
                return new int[0];
            }
            for (int i = 0; i < v / 2; i++) {
                res[index] = k;
                index++;
            }
        }
        return res;
    }

    public static int[] findOriginalArray(int[] changed) {
        if (changed == null || changed.length % 2 != 0) {
            return new int[0];
        }

        int[] res = new int[changed.length / 2];

        int curr = 0;
        int repeat = 1;
        int index = 0;
        Arrays.sort(changed);

        while (index < changed.length - 1) {
            if (curr == changed[index]) {
                repeat++;
            } else {
                if (repeat % 2 != 0) {
                    return new int[0];
                }
                curr = changed[index];
                repeat = 1;
            }
            if (repeat % 2 != 0 && index == changed.length - 1) {
                return new int[0];
            }
            if (repeat % 2 == 0) {
                for (int i = 0; i < repeat / 2; i++) {
                    res[index / 2] = curr;
                    index += 2;
                }
                curr = changed[index];
                repeat = 1;
            }
        }
        return res;
    }
       
    
}