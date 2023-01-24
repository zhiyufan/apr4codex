package com.codex;

import java.util.*;

public class Solution {
/*
Find the common numbers between the two arrays

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class CommonNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < t; i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];
            for(int j = 0; j < m; j++)
                arr1[j] = s.nextInt();
            for(int j = 0; j < n; j++)
                arr2[j] = s.nextInt();
            res.add(findCommon(arr1, arr2));
        }
        for(int i = 0; i < t; i++) {
            List<Integer> temp = res.get(i);
            System.out.println("\nCase: "+(i+1)+": "+temp);
        }
    }

    private static List<Integer> findCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i]))
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                set.remove(nums2[i]);
                res.add(nums2[i]);
            }
        }
        return res;
    }
}
}