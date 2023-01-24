package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int n: nums1) {
            set1.add(n);
        }
        for (int n: nums2) {
            if (set1.contains(n)) {
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
    
    public static void main(String[] args) {
        int[] nums1 = new int[]{0,0,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2};
        int[] nums2 = new int[]{2,2,2,2,2,3,3,3,3,3};
        int[] nums3 = new int[]{5,5,5,5,5,5,5,5};
        int[] nums4 = new int[]{};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
}
}