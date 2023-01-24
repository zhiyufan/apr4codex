package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        //add elements from nums1 to map
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}