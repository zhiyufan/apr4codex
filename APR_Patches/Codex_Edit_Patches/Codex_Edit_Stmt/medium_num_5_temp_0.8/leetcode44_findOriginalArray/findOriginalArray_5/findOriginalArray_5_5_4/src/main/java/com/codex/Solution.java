package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        int index = 0;
        }

        HashMap<Integer, Integer> cache = new HashMap<>();
            int num = changed[i];
        int[] res = new int[changed.length / 2];

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            int count = cache.getOrDefault(num, 0);

            int origin = cache.getOrDefault(num, 0);
            cache.put(num, origin + 1);

            if (count % 2 != 0) {
                return new int[0];
            }

            for (int j = 0; j < count / 2; j++) {
                res[index] = num;
                index++;
            }
        }
        return res;
    }

    
}