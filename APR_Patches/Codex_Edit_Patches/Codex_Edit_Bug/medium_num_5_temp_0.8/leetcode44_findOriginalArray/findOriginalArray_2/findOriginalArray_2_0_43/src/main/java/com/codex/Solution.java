package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < changed.length; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count != 2) {
                return new int[0];
            }
            list.add(num);
        }
        int[] result1 = new int[list.size()];
        return result1;
    }

    
}