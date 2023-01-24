package com.codex;

import java.util.*;

public class Solution {
public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i : nums1) {
           if (!list1.contains(i)) {
               list1.add(i);
           }
        }
        for (int i : nums2) {
            if (!list2.contains(i)) {
                list2.add(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                list1.remove(i);
                i--;
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
                i--;
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }

    /*public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1)
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
        result.add(list1);
        result.add(list2);
        return result;
    }
}