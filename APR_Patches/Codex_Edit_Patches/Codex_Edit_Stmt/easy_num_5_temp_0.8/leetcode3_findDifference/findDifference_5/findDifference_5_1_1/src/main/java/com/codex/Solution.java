package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(String[] nums1, String[] nums2) {
        
        Map<String, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            map.put(n1, 1);
        }
        for (int n2 : nums2) {
            if (map.containsKey(n2)) {
                map.remove(n2);
            } else {
                map.put(n2, 1);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.get(0).add(Integer.parseInt(entry.getKey()));
            } else {
                result.get(1).add(Integer.parseInt(entry.getKey()));
            }
        }
        return result;
    }

    
}