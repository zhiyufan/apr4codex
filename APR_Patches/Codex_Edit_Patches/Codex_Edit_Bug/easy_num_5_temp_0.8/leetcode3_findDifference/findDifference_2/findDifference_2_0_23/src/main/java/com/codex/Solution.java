package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        List<List<Integer>> res = findDifference(nums1, nums2);
        System.out.println(res);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            if (!set.contains(i)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                res.add(list);
                set.add(i);
            }
        }
        for (int i : nums2) {
            if (!set.contains(i)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                res.add(list);
                set.add(i);
            }
        }
        return res;
    }

    
}