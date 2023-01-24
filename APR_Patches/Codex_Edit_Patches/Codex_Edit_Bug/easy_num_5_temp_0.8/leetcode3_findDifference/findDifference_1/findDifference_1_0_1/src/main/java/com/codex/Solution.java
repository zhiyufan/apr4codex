package com.codex;

import java.util.*;

public class Solution {
   public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num)

        List<List<Integer>> res = new ArrayList<>();

        for (int num: nums1) {
            set2.remove(num);
        }

        for (int num: nums2) {
            set1.remove(num);
        }

        res.add(new ArrayList<>(set1));
        res.add(new ArrayList<>(set2));

        return res;

    }
}