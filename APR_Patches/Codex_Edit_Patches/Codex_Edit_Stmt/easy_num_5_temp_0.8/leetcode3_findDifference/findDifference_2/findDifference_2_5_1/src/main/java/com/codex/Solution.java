package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int num : nums1)
            if (!list2.contains(num)) list2.add(num);
        for (int num : nums2)
            if (!list1.contains(num)) list1.add(num);
        res.add(list1);
        res.add(list2);
        return res;
    }

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

        
}