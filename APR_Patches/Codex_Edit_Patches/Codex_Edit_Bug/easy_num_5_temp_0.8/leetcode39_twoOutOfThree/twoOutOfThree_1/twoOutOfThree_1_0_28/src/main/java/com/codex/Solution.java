package com.codex;

import java.util.*;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    if (!result.contains(nums1[i])) {
                        result.add(nums1[i]);
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {           
            if (Arrays.asList(nums3).contains(nums2[i])) {
                if (!result.contains(nums2[i])) {
                    result.add(nums2[i]);
                } 
            }     
        }
        Collections.sort(result);
        return result;
    }    
}