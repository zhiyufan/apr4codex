package com.codex;

import java.util.*;

public class Solution {
    public static int[] findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int[] res = new int[list1.size() + list2.size()];

        for (int num: nums1) {
            if (!set2.contains(num)) list1.add(num);
        }

        for (int num: nums2) {
            if (!set1.contains(num)) list2.add(num);
        }

        for (int i = 0; i < list1.size(); i++) {
            res[i] = list1.get(i);
        }

        for (int i = 0; i < list2.size(); i++) {
            res[i+list1.size()] = list2.get(i);
        }

        return res;

    }

    
}