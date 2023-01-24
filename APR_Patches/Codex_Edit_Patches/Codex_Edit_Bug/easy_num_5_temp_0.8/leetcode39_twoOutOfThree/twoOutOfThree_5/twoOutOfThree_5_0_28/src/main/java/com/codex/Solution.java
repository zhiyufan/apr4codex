package com.codex;

import java.util.*;

public class Solution {
    public static boolean twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int n: nums1) {
            set1.add(n);
        }
        for (int n: nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        for (int n: nums3) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        
        return new ArrayList<>(set2);
    }
    
    
}