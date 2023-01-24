package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> FindDifference(int[] nums1, int[] nums2) {
        // Write your code here
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : nums1) set1.add(i);
        for (int i : nums2) set2.add(i);
        for (int i : nums1) if (!set2.contains(i)) list2.add(i);
        for (int i : nums2) if (!set1.contains(i)) list1.add(i);
        for (int i : set1) list1.add(i);
        for (int i : set2) list2.add(i);
        res.add(list1);
        res.add(list2);
        return res;
    }


    
}