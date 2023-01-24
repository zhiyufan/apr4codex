package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) set1.add(i);
        for (int i : nums2) set2.add(i);
        for (int i : nums1) if (!set2.contains(i)) set2.add(i);
        for (int i : nums2) if (!set1.contains(i)) set1.add(i);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : set1) list1.add(i);
        for (int i : set2) list2.add(i);
        res.add(list1);
        res.add(list2);
        return res;
    }





        public static List<Integer> intersection(int[] nums1, int[] nums2) {

            Set<Integer> set1 = new HashSet<>();
            List<Integer> res = new ArrayList<>();
            for (int i : nums1) set1.add(i);
            for (int i : nums2) {
                if (set1.contains(i)) {
                    set1.remove(i);
                    res.add(i);
                }
            }
            return res;
        }
    
}