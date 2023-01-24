package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 > len2) {
            return findDifference(nums2, nums1);
        }
        for (int n : nums1) {
            if (!set2.contains(n)) {
                ans.add(n);
            }
        }
        for (int n : set2) {
            ans.add(n);
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    
}