package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        for (int num: nums1) {
            if (!set2.contains(num)) list1.add(num);
        }

        for (int num: nums2) {
            if (!set1.contains(num)) list2.add(num);
        }

        res.add(list1);
        res.add(list2);

    public static List<Integer> getRow(int rowIndex) {

            List<Integer> list = new ArrayList<>();

            list.add(1);

            for (int i = 1; i <= rowIndex; i++) {
                list.add(1);
                for (int j = i - 1; j > 0; j--) {
                    list.set(j, list.get(j) + list.get(j - 1));
                }
            }

            return list;
        }

        return res;

    }

    
}