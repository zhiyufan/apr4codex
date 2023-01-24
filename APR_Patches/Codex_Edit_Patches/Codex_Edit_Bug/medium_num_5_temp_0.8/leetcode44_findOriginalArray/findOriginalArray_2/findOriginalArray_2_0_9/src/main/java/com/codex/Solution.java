package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs == null || pairs.length == 0){
            return 0;
        }
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));

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