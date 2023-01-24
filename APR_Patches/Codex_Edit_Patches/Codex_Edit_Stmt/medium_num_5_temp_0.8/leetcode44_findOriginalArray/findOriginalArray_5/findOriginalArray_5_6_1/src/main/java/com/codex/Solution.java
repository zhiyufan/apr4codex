package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {

        if (changed == null || changed.length % 2 != 0) {
            return new int[0];
        }

        int[] res = new int[changed.length / 2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : changed) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        
        int index = 0;
        for (int num : map.keySet()) {
            int count = map.get(num);
            if (count % 2 != 0) {
                return new int[0];
            }

            for (int i = 0; i < count / 2; i++) {
                res[index] = num;
                index++;
            }
        }
        
        return res;
    }
}