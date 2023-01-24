package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < changed.length; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count != 2) {
                int[] result = new int[map.size()];
                for (int j = 0; j < result.length; j++) {
                    result[j] = list.get(j);
                }
                return result;
            }
            list.add(num);
        }
        return new int[0];
    }

    
}