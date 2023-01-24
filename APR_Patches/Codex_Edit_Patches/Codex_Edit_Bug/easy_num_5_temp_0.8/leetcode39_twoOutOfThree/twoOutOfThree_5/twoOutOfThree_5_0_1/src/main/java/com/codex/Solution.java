package com.codex;

import java.util.*;

public class Solution {

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        
        Set<Integer> set2 = new HashSet<>();
        
        for (int n: nums1) {
            if (set2.contains(n)) {
                set2.add(n);
            }
        }
        for (int n: nums2) {
            if (set2.contains(n)) {
                set2.add(n);
            }
        }
        for (int n: nums3) {
            if (set2.contains(n)) {
                set2.add(n);
            }
        }
        
        return new ArrayList<>(set2);
    }
}