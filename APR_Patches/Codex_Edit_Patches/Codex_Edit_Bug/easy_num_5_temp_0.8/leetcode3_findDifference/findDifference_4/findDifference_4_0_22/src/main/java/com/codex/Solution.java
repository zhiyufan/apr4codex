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
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }











    // this is the program to find nth element of the pascal's triangle
    public static int findPascalElement(int n, int k) {
        
        if (k == 0 || k == n) {
            return 1;
        }
        
        return findPascalElement(n - 1, k - 1) + findPascalElement(n - 1, k);
    }


    public static void main(String[] args) {
        
        int i = findPascalElement(4, 2);
        System.out.println(i);
    }


    
}