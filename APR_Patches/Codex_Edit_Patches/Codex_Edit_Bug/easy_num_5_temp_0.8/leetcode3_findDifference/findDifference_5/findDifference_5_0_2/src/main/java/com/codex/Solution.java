package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
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

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                l1.add(entry.getKey());
            } else {
                l2.add(entry.getKey());
            }
        }
        List<List<Integer>> response = new ArrayList<>();
        response.add(l1);
        response.add(l2);
        return response;
    }
}