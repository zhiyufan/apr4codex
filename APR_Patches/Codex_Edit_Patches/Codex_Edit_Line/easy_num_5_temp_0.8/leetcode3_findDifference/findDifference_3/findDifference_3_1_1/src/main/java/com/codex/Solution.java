package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        result.add(list1); //list1 is in the first position of result
        result.add(list2); //list2 is in the second position of result
        return result;
    }
}