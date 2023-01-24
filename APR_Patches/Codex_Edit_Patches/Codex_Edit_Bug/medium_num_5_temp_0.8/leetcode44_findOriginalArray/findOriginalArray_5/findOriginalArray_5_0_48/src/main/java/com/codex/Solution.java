package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] arr) {
        int[] res = new int[arr.length];
        if (arr.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> cache = new HashMap<>();
        if (arr.length == 1) {
            return arr;
        }

        for (int num : arr) {
            int count = cache.getOrDefault(num, 0);
            cache.put(num, count + 1);
        }

        int i = 0;
        for (int key : cache.keySet()) {
            int val = cache.get(key);
            if (val % 2 == 1) { // odd
                return res;
            }
            res[i] = key;
            res[res.length - 1 - i] = key;
            i++;
        }
        return res;
    }

    
}