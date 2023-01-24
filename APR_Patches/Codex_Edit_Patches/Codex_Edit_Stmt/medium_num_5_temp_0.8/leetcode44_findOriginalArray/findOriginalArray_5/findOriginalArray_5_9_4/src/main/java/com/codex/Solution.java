package com.codex;

import java.util.*;

public class Solution {
    // Assumming array length is even, if not, return empty array
    public static int[] findOriginalArray(int[] changed) {
        int[] res = new int[changed.length / 2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < changed.length; i++) {
            if (map.containsKey(changed[i])) {
                map.put(changed[i], map.get(changed[i]) + 1);
            } else {
                map.put(changed[i], 1);
            }
        }
        int index = 0;
        for (int i : map.keySet()) {
            if (map.get(i) % 2 == 0) {
                res[index] = i;
                index++;
            } else {
                break;
            }
        }
        if (index != res.length) {
            return new int[0];
        }
        return res;
    }

    
}