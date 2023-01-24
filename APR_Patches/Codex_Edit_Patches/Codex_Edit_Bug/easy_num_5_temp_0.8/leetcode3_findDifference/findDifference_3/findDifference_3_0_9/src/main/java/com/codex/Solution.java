package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                list.add(i);
            }
        }
        for (int i : nums1) {
            if (!list.contains(i)) {
                result.add(i);
            }
        }
        for (int i : nums2) {
            if (!list.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}