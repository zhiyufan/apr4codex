package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int n : nums1) {
            s1.add(n);
        }
        for (int n : nums2) {
            s2.add(n);
        }
        for (Iterator<Integer> it = s1.iterator(); it.hasNext(); ) {
            if (s2.contains(it.next())) it.remove();
        }
        for (Iterator<Integer> it = s2.iterator(); it.hasNext(); ) {
            if (s1.contains(it.next())) it.remove();
        }
        ans.add(new ArrayList<>(s1));
        ans.add(new ArrayList<>(s2));
        return ans;
    }

    
}