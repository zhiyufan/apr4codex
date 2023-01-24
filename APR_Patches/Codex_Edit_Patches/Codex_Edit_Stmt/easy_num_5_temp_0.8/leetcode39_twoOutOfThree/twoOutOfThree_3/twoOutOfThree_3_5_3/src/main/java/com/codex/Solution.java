package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums3) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        for (int num : nums3) {
            set3.add(num);
        }
        for (int num : set2) {
            if (set3.contains(num)) {
                result.add(num);   
            }
            
        }
        return result;
    }

    
}