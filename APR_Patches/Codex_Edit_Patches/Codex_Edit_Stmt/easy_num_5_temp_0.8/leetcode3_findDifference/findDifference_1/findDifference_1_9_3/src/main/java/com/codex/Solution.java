package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);

        List<List<Integer>> res = new ArrayList<>();

        List<Integer> list1 = nums1.stream().filter(ele -> !set2.contains(ele)).collect(Collectors.toList());

        List<Integer> list2 = nums2.stream().filter(ele -> !set1.contains(ele)).collect(Collectors.toList());

        res.add(list1);
        res.add(list2);

        return res;

    }

    
}