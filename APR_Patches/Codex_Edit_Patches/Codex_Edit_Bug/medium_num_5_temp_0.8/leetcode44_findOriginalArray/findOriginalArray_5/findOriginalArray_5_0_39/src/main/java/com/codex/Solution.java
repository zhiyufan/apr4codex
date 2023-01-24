package com.codex;

import java.util.*;

public class Solution {
[12:44] 
public static int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 != 0) return new int[0];

        Map<Integer, Integer> cache = new HashMap<>();
        int[] result = new int[changed.length / 2];
        for (int i = 0; i<changed.length; i++) {
            int num = changed[i];
            cache.put(num, cache.getOrDefault(num,0) + 1);
        }

        int index=0;
        for (int n : cache.keySet()) {
            int v = cache.get(n);
            if(v % 2 != 0) return new int[0];
            for (int i=0; i<v/2; i++) {
                result[index] = n;
                index++;
            }
            for (int i = 0; i < v / 2; i++) {
                res[index] = k;
                index++;
            }
        }
        return res;
    }

    
}