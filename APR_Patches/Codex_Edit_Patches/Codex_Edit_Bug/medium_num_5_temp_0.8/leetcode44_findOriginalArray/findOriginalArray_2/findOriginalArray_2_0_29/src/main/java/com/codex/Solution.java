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
            int num = entry.getKey(); // 3
            int count = entry.getValue(); // 1
            if (count != 2) { // 1
        
        // list = [3, 4, 5]
        
                return new int[0];
            }
            list.add(num);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i); // 3,4,5
        }

        return result;
    }


    // result = [3,4,5]


}
}