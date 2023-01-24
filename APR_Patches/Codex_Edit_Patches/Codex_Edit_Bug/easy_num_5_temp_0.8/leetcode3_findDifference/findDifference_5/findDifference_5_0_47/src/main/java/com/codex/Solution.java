package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            if (map.get(n1) == null) {
                map.put(n1, 1);
            } else {
                map.put(n2, 1);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.get(0).add(entry.getKey());
            } else {
                result.get(1).add(entry.getKey());
            }
        }
        return result;
    }

    
}