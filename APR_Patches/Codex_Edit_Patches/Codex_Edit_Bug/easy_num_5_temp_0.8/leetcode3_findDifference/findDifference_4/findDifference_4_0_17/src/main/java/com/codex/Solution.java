package com.codex;

import java.util.*;

public class Solution {
public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> set1 = new ArrayList<>();
    List<Integer> set2 = new ArrayList<>();
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
    ans.add(set1);
    ans.add(set2);
    return ans;
}
        
}