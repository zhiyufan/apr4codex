package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] findOriginalArray(int[] changed) {
        // Write your solution here
        if(changed == null || changed.length == 0) {
            return new int[0];
        }
        int[] result = new int[changed.length / 2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : changed) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int index = 0, count = 0;
        while(count < result.length) {
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                int key = entry.getKey();
                if(value != 0) {
                    result[index] = key;
                    index++;
                    value--;
                    count++;
                }
                if(value != 0) {
                    result[index] = key;
                    index++;
                    value--;
                    count++;
                }
                entry.setValue(value);
            }
        }
        return result;
    }
}
}