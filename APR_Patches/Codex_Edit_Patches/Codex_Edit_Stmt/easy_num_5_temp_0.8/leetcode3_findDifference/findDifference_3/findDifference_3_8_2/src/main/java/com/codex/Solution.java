package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> getSamllSet(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> result = new ArrayList<>();
        if (set1.size() > set2.size()) {
            return getSamllSet(set2, set1);
        }
        for (int i : set1) {
            if (!set2.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        result.add(getSamllSet(set1, set2));
        result.add(getSamllSet(set2, set1));
        return result;
    }
}