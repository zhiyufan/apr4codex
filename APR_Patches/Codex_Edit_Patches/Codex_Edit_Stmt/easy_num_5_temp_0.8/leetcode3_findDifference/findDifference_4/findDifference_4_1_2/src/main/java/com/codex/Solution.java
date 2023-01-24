package com.codex;

import java.util.*;

public class Solution {
    public static int[] findDifference(int[] nums1, int[] nums2) {

        int[] ans = new int[2];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums1) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : nums2) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
        ans[0] = set1.iterator().next();
        ans[1] = set2.iterator().next();
        return ans;
    }

    
}