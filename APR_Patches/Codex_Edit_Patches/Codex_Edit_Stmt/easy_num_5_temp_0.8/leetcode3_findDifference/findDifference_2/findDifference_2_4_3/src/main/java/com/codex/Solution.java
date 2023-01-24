package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) set1.add(i);
        for (int i : nums2) {
            if (!set1.contains(i)) res.add(Arrays.asList(i));
            else set1.remove(i);
        }
        res.add(new ArrayList<>(set1));
        return res;
    }

    
}