package com.codex;

import java.util.*;

public class Solution {
    public static int[] findDifference(int[] nums1, int[] nums2) {

        int[] res = new int[2];

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        set1.removeAll(set2);

        res[0] = set1.iterator().next();

        set2.removeAll(set1);

        res[1] = set2.iterator().next();

        return res;

    }
}