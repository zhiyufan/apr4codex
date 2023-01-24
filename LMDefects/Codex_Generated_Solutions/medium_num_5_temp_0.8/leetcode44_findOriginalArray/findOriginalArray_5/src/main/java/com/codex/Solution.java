package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        /** An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.
         * Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
         */
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

    }