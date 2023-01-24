package com.codex;

import java.util.*;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(); 

        int i = 0;
        while (i < nums1.length) {
            set1.add(nums1[i]);
            i++;
        }

        i = 0;
        while (i < nums2.length) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
            i++;
        }

        int[] res = new int[set2.size()];
        int j = 0;
        for (int num: set2) {
            res[j] = num;
            j++;
        }

        return res;

    }
}