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
            Integer count = cache.get(num);
            if (count == null) {
                cache.put(num, 1);
            } else {
                cache.remove(num);
            }
        }

        int index = 0;
        Object[] keys = cache.keySet().toArray();
        int num = (int) keys[0];
        int count = cache.get(num);
        for (int i = 0; i < count; i++) {
            res[index] = num;
            index++;
        }
        return res;
    }

    
}