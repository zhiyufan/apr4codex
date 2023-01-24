package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(nums1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(nums2));
        for (int n : set2) {
            if (set1.contains(n)) {
                set1.remove(n);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }
}