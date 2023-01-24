package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int i = 0;
        while (i < nums1.length) {
            int j = 0;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    nums1[i] = 0;
                    nums2[j] = 0;
                    break;
                }
                j++;
            }
            i++;
        }
        for (int i : nums1) {
            if (i > 0) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (i > 0) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}