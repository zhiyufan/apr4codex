package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set2 = new HashSet<Integer>(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.stream(nums1).boxed().collect(Collectors.toSet()));
        int minLenght = Math.min(nums1.length, nums2.length);
        int[] minArr = nums1.length < nums2.length ? nums1 : nums2;
        int[] maxArr = nums1.length >= nums2.length ? nums1 : nums2;
        for (int n : minArr) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : maxArr) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }
}
}