package com.codex;

import java.util.*;

public class Solution {
 public static int[] findOriginalArray(int[] changed) {
        int[] result = new int[changed.length / 2];
        int resultIndex = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < changed.length; i++) {
            int value = changed[i];
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

            int key = entry.getKey();
            int count = entry.getValue();
            if (count != 2) {
                return new int[0];
            }
            result[resultIndex] = key;
            resultIndex++;
        }
        return result;
    }



public static int[] findOriginalArray(int[] changed) {
        
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new ArrayList();
        
        for (int i = 0; i < changed.length; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }

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