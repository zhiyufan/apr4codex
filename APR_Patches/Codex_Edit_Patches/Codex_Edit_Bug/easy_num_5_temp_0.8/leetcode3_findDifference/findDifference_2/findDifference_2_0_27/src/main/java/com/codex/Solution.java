package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i : nums1) list1.add(i);
        for (int i : nums2) list2.add(i);
        for (int i : nums1) if (list2.contains(i)) list2.remove(new Integer(i));
        for (int i : nums2) if (list1.contains(i)) list1.remove(new Integer(i));
        res.add(list1);
        res.add(list2);
        return res;
    }

    
}