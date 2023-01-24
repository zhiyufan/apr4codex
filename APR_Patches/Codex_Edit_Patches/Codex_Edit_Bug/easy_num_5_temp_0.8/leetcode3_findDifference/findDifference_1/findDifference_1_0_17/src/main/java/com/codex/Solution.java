package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        if (nums1 == null || nums2 == null) return null;
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) {
            if (!set1.contains(num)) set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        list1.addAll(set1);
        list2.addAll(set2);

        for (int num: nums2) {
            if (!set1.contains(num)) list2.add(num);
        }

        res.add(list1);
        res.add(list2);

        return res;

    }

    
}