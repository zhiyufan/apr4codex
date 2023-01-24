package com.codex;

import java.util.*;

public class Solution {
//Find the Difference


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i=0;i<nums1.length;i++) {
            if (nums1[i]!=nums2[i]) {
                list.add(nums2[i]);
                break;
            }
        }
        for (int i = nums1.length;i<nums2.length;i++) {
            list.add(nums2[i]);
        }
        
        res.add(list);
        return res;
    }   
}