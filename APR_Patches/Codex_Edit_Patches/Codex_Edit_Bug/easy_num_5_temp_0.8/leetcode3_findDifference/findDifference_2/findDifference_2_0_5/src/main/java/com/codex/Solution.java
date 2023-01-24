package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res = new ArrayList<>();
        int n = nums1.length, m = nums2.length;
        Set<Integer> set1 = new HashSet(), set2 = new HashSet();
        for (int i : nums1) if (set1.add(i) == false) set1.remove(i);
        for (int i : nums2) if (set2.add(i) == false) set2.remove(i);
        Iterator<Integer> iter = set1.iterator();
        while (iter.hasNext()) {
            int x = iter.next();
            if (set2.contains(x)) {
                iter.remove();
                set2.remove(x);
            }
        }
        res.add(new ArrayList<>(set1));
        res.add(new ArrayList<>(set2));
        return res;
    }

    
}