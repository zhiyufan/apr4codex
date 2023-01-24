package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        /** Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
         *  answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
         *  answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
         *  Note that the integers in the lists may be returned in any order.
         */
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