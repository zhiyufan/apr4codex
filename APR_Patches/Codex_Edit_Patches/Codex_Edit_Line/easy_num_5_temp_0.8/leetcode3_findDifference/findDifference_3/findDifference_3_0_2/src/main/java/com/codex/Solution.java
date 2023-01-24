package com.codex;

import java.util.*;

public class Solution {
public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int count = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count++;
                }
            }
            if (count == 0) {
                list1.add(i);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int count = 0;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    count++;
                }
            }
            if (count == 0) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}