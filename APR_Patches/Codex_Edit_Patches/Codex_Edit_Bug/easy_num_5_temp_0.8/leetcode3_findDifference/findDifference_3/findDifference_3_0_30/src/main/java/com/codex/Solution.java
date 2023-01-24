package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        // save the number and its count
        for (int i : nums1) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else  {
                map1.put(i, 1);
            }
        }

        for (int i : nums2) {
            if (map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }

        for (int i : nums1) {
            if (!map2.containsKey(i) || (map2.containsKey(i) && map2.get(i) == 0)) {
                list1.add(i);
            }
        }
         for (int i : nums2) {
            if (!map1.containsKey(i) || (map1.containsKey(i) && map1.get(i) == 0)) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}