package com.codex;

import java.util.*;

public class Solution {
    public static int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        
        for (Integer i: map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }
}