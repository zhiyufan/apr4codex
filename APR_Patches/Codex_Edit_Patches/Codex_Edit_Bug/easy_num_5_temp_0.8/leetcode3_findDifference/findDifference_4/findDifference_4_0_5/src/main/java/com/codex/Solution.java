package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums1) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : nums2) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
        int[] array1 = new int[set1.size()];
        int[] array2 = new int[set2.size()];
        int count1 = 0;
        int count2 = 0;

        for (int n : set1) {
            array1[count1] = n;
            count1++;
        }
        for (int n : set2) {
            array2[count2] = n;
            count2++;
        }
        ans.add(toList(array1));
        ans.add(toList(array2));

        return ans;
    }

    private static List<Integer> toList(int[] array) {
        List<Integer> ans = new ArrayList<>(array.length);
        for (int n : array) {
            ans.add(n);
        }
        return ans;
    }
    
}