package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums1) {
            set.add(n);
        }
        for (int n : nums2) {
            set.add(n);
        }
        for (int n : nums3) {
            set.add(n);
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

    
}