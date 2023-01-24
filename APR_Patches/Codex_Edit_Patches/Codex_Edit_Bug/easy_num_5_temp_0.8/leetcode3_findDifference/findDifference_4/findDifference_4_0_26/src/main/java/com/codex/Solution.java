package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        for (int n : nums2) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                set.remove(n);
            }
        }
        ans.add(new ArrayList<>(set));
        return ans;
    }

    
}