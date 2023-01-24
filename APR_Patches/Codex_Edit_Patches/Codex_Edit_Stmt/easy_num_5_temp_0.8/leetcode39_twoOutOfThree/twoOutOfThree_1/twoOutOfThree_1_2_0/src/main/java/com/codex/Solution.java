package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                    nums1[i] = Integer.MAX_VALUE;
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    result.add(nums1[i]);
                    nums1[i] = Integer.MAX_VALUE;
                    nums3[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    result.add(nums2[i]);
                    nums2[i] = Integer.MAX_VALUE;
                    nums3[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return result;
    }

    
}