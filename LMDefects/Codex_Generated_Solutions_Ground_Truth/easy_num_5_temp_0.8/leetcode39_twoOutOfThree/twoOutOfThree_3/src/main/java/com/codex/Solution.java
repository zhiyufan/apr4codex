package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        /** Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
         */
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)&& !result.contains(num)) {
                result.add(num);
            }
            set2.add(num);
        }
        for (int num : nums3) {
            if ((set1.contains(num) || set2.contains(num)) && !result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    }