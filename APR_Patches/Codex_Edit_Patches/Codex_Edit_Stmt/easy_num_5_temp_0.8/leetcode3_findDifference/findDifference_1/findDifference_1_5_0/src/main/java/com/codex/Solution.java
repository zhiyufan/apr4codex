package com.codex;

import java.util.*;

public class Solution {
    /**
    * the difference between set1 and set2, and set2 and set1
    */

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        list1.addAll(set1);
        list1.removeAll(set2);

        list2.addAll(set2);
        list2.removeAll(set1);

        res.add(list1);
        res.add(list2);

        return res;

    }

    
}