package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> extra1 = new ArrayList<>();
        List<Integer> extra2 = new ArrayList<>();
        for (int n : nums1) {
            set.add(n);
        }
        for (int n : nums2) {
            if (!set.contains(n)) {
                extra2.add(n);
                set.add(n);
            } else {
                set.remove(n);
            }
        }
        for (int n : nums1) {
            if (!set.contains(n)) {
                set.add(n);
                extra1.add(n);
            } else {
                set.remove(n);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    
}