package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len3 = nums3.length;
        if (len1 == 0 || len2 == 0 || len3 == 0) {
            return result;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
            for (int j = 0; j < len3; j++) {
                if (nums1[i] == nums3[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len3; j++) {
                if (nums2[i] == nums3[j]) {
                    if (nums2[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
}