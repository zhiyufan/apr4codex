package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        
        for (int n: nums1) {
            set1.add(n);
        }
        for (int n: nums2) {
            if (!set1.contains(n)) {
                set1.add(n);
            }
        }
        for (int n: nums3) {
            if (!set1.contains(n)) {
                set1.add(n);
            }
        }
        
        for (int n: nums1) {
            if (set1.contains(n)) {
                result.add(n);
                set1.remove(n);
            }
        }
        
        return result;
    }
    
    
}