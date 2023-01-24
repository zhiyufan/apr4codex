package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<>();
        int[] count1 = new int[10000];
        int[] count2 = new int[10000];
        for (int i : nums1) {
            count1[i] += 1;
        }
        for (int i : nums2) {
            count2[i] += 1;
        } 
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] > count2[i]) {
                for (int j = count2[i]; j < count1[i]; j++)
                    l1.add(i);
            } else if (count1[i] < count2[i]) {
                for (int j = count1[i]; j < count2[i]; j++)
                    l2.add(i);
            } else {
            }
        }
        ans.add(l1);
        ans.add(l2);
        return ans;
    }

    
}