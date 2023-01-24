package com.codex;

import java.util.*;

public class Solution {
    public static int[] twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        if (nums1 == null || nums2 == null || nums3 == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>(nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                list.add(nums2[i]);
            }
            set2.add(nums2[i]);
        }
        for (int i = 0; i < nums3.length; i++) {
            if (set1.contains(nums3[i]) || set2.contains(nums3[i])) {
                list.add(nums3[i]);
            }
        }
        return result;
    }

    
}