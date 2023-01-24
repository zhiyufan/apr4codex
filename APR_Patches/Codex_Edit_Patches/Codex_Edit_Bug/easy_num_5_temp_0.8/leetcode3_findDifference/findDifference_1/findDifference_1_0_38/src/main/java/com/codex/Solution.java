package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num: nums3) set3.add(num);

        for (int num: nums1) set1.add(num);
        List<List<Integer>> res = new ArrayList<>();

        for (int num: nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num: nums1) {
            if (!set2.contains(num) && !set3.contains(num)) list1.add(num);
        }

        for (int num: nums2) {
            if (!set1.contains(num) && !set3.contains(num)) list2.add(num);
        }
        res.add(list1);
        res.add(list2);
        return res;

        List<Integer> list3 = new ArrayList<>();
        for (int num: nums3) {
            if (!set1.contains(num) && !set2.contains(num)) list3.add(num);
        }
        res.add(list3);

        return res;

    }
}