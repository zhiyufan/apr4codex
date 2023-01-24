package com.codex;

import java.util.*;

public class Solution {
public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());
    result.add(new ArrayList<>());
    
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums1) {
        map.put(n, map.containsKey(n) ? map.get(n) + 1 : 1);
    }

    for (int n : nums2) {
        if (map.containsKey(n)) {
            map.put(n, map.get(n) - 1);
            if (map.get(n) == 0) {
                map.remove(n);
            }
        } else {
            result.get(1).add(n);
        }
    }
    for (int key : map.keySet()) {
        result.get(0).add(key);
    }
    return result;
}
}