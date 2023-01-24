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
            set2.add(num);
        }
        for (int num : nums3) {
            if (set1.contains(num) && !result.contains(num)) {
                result.add(num); 
            } else if (set2.contains(num) && !result.contains(num)) {
                result.add(num); 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(twoOutOfThree(new int[]{1, 2, 3}, new int[]{5, 7, 8}, new int[]{5, 3, 1, 7}));
    }
}