package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(List<List<Integer>> numbers) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> nums1 : numbers) {
            for (int n1 : nums1) {
                map.put(n1, 1);
            }
        }

        for (List<Integer> nums2 : numbers) {
            for (int n2 : nums2) {
                if (map.containsKey(n2)) {
                    map.remove(n2);
                } else {
                    map.put(n2, 1);
                }
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