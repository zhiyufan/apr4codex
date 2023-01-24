package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        // //用index循环也可以
        // for(int i = 0; i < nums1.length; i++) {
        //     set1.add(nums1[i]);
        // }
        
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
            set2.add(num);
        }
        //用index循环也可以
        // for(int i = 0; i < nums2.length; i++) {
        //     if (set1.contains(nums2[i])) {
        //         result.add(nums2[i]);
        //     }
        //     set2.add(nums2[i]);
        // }
        
        for (int num : nums3) {
            if (set1.contains(num) || set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    
}