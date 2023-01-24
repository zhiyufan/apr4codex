package com.codex;

import java.util.*;

public class Solution {
int[] findOriginalArray(int[] changed) {
    
    if ((changed.length & 1) == 1) {
        return new int[0];
    }

    int[] res = new int[changed.length / 2];

    Map<Integer, Integer> map = new HashMap<>();
    for (Integer n : changed) {
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    for (Integer key : map.keySet()) {
        int f = map.get(key) / 2;
        if (f == 0) {
            return new int[0];
        }

        for (int i = 0; i < f; i++) {
            res[i] = key;
        }
        return res;
    }

    
}