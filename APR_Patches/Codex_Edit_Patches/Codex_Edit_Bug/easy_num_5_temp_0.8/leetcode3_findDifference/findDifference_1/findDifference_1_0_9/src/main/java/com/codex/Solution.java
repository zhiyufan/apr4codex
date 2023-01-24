package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        for (int num: nums1) {
            if (!set2.contains(num)) list1.add(num);
        }

        for (int num: nums2) {
            if (!set1.contains(num)) list2.add(num);
        }

        res.add(list1);
        res.add(list2);

        return res;

    }

    public static void main(String[] args) {
		int[] nums1 = new int[]{1,2,3,4,5,6,3};
		int[] nums2 = new int[]{1,7,8};
		
		List<List<Integer>> res = findDifference(nums1, nums2);
		
		for (List<Integer> list : res) {
			System.out.println("\n");
			for (int num : list) {
				System.out.print(num + " ");
			}
		}
	}
}