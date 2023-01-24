package com.codex;

import java.util.*;

public class Solution {
    public static List<Set<Integer>> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Set<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>(set);
        for (int num : nums1) {
            set1.add(num);
            set.remove(num);
        }

        Set<Integer> set2 = new HashSet<>();
        
        for (int num : set) {
            result.add(set);
        }
        set.clear();
        for (int num : nums2) {
            set2.add(num);
            set.add(num);
        }
        for (int num : nums3) {
            if (set1.contains(num) || set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    
}