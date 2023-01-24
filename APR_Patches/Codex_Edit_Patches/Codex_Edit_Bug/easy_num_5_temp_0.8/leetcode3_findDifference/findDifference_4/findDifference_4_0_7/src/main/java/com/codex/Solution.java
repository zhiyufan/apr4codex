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
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (Integer n : set) {
            list1.add(n);
        } 
        for (int i = 0; i < nums1.length; i++) {
            list2.add(nums1[i]);
        } 
        for (int i = 0; i < nums2.length; i++) {
            if (list2.contains(nums2[i])) {
                list2.remove(new Integer(nums2[i]));
            } 
        } 
        ans.add(list1);
        ans.add(list2);
        return ans;
    }

    
}