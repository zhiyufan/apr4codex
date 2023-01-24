package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }


public class Solution
{
	public static void main(String[] args) {
		//System.out.println("Hello Java");
		int [] nums1 = {3,3};
		int [] nums2 = {3,3};
		int [] arr = {0,0,2,2,3,3};
		
		String s1 = "abcd";
		String s2 = "abcd";
		
		System.out.println(s1.equals(s2));
		
		List<List<Integer>> resu = findDifference(nums1,nums2);
		System.out.println(resu);
		
	}
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        System.out.println(set1);
        for (int i : nums2) {
            set2.add(i);
        }
        System.out.println(set2);
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
	
}
}