package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> a1 = new HashSet();
        Set<Integer> a2 = new HashSet();
        for (int i : nums1) {
            a1.add(i);
        }
        for (int i : nums2) {
            a2.add(i);
        }
        int cnt = 0;
        List<Integer> a = new ArrayList<>();
        for (int i : a1) {
            if (!a2.contains(i)) {
                a.add(i);
            } else {
                cnt++;
            }
        }
        
        List<Integer> b = new ArrayList<>();
        for (int i : a2) {
            if (!a1.contains(i)) {
                b.add(i);
            } else {
                cnt++;
            }
        }
        
        res.add(a);
        res.add(b);
        return res;
    }
}