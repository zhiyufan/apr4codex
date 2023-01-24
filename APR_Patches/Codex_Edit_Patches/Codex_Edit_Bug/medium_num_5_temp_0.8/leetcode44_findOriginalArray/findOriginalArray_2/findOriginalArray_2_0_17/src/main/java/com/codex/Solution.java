package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[changed.length];

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            if (map.containsKey(num)) {
                result[i] = map.get(num);
                map.remove(num);
            } else {
                result[i] = i;
                map.put(num, i);
            }
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
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    
}