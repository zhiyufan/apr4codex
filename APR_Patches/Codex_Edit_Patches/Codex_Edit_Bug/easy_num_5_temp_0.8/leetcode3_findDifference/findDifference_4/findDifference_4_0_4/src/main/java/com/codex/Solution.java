package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        
        List<Integer> arr3 = new ArrayList<>();
        List<Integer> arr4 = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                   arr2[j] = -1;
                   break;
                }
            }
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
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    
}