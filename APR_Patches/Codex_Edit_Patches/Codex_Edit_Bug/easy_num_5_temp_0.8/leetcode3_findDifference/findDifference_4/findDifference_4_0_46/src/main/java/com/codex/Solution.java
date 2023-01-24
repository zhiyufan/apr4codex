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
        for (int n2 : nums2) {
            set2.add(n2);
        }
        for (int n1 : nums1) {
            if (!set2.contains(n1)) {
                set1.add(n1);
            } else {
                set1.remove(n1);
            }
        }
        for (int n2 : nums2) {
            if (!set1.contains(n2)) {
                set2.add(n2);
            } else {
                set2.remove(n2);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    
}