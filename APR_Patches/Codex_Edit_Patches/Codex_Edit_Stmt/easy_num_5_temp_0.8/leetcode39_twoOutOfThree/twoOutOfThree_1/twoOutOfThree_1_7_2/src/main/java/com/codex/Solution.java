package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        int[] nums1_copy = Arrays.copyOf(nums1, nums1.length);
        Arrays.sort(nums2);
        int[] nums2_copy = Arrays.copyOf(nums2, nums2.length);
        Arrays.sort(nums3);
        int[] nums3_copy = Arrays.copyOf(nums3, nums3.length);
        for (int i = 0; i < nums1_copy.length; i++) {
            for (int j = 0; j < nums2_copy.length; j++) {
                if (nums1_copy[i] == nums2_copy[j]) {
                    if (nums1_copy[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1_copy[i]);
                        nums1_copy[i] = 0;
                        nums2_copy[j] = 0;
                        break;
                    }
                }
            }
            for (int j = 0; j < nums3_copy.length; j++) {
                if (nums1_copy[i] == nums3_copy[j]) {
                    if (nums1_copy[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1_copy[i]);
                        nums1_copy[i] = 0;
                        nums3_copy[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums2_copy.length; i++) {
            for (int j = 0; j < nums3_copy.length; j++) {
                if (nums2_copy[i] == nums3_copy[j]) {
                    if (nums2_copy[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2_copy[i]);
                        nums2_copy[i] = 0;
                        nums3_copy[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
}