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

// Correct this code
public static int[] findOriginalArray(int[] changed) {
     HashMap<Integer, Integer> map = new HashMap<>();
     for (int i : changed) {
       if (map.containsKey(i)) {
           map.put(i, map.get(i) + 1);
       } else {
           map.put(i, 1);
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