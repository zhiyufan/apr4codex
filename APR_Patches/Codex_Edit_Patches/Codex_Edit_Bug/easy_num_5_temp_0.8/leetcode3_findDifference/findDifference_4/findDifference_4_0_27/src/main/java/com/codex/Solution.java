package com.codex;

import java.util.*;

public class Solution {
public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int n : nums1) {
            list1.add(n);
        }
        for (int n : nums2) {
            list2.add(n);
        }
        for (int n : nums1) {
            if (!list2.contains(n)) {
                list2.add(n);
            } else {
                list2.remove(Integer.valueOf(n));
            }
        }
        for (int n : nums2) {
            if (!list1.contains(n)) {
                list1.add(n);
            } else {
                list1.remove(Integer.valueOf(n));
            }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
}

    
}