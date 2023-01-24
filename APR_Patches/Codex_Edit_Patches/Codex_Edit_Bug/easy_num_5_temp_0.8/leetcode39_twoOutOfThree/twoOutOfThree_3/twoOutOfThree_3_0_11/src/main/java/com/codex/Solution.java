package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            if (set.contains(num)) {
                set.remove(num);
                result.add(num);
            } else {
                set.add(num);
            }
        }

        for (int num : nums3) {
            if (set.contains(num)) {
                set.remove(num);
                result.add(num);
            }
        }
        return result;
    }

    
}