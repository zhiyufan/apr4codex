package com.codex;

import java.util.*;

public class Solution {
public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i : nums1) {
            if (set2.contains(i)) {
                set2.remove(i);
            } else {
                set1.add(i);
            }
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set1.remove(i);
            } else {
                set2.add(i);
            }
        }
        res.add(new ArrayList<Integer>(set1));
        res.add(new ArrayList<Integer>(set2));
        return res;
    }
}
}