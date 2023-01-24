package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    List<Integer> list = new ArrayList<>();

    for (int num: nums1) set1.add(num);

    for (int num: nums2) {
        if (!set1.contains(num)) list.add(num);
    }

        List<List<Integer>> res = new ArrayList<>();

        for (int num: nums1) {
            if (!set2.contains(num)) list1.add(num);
        }

        for (int num: nums2) {
            if (!set1.contains(num)) list2.add(num);
        }

        res.add(list1);
        res.add(list2);

        return res;

    }

    
}