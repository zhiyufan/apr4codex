package com.codex;

import java.util.*;

public class Solution {
package java_program;

import java.util.ArrayList;
import java.util.HashMap;

public class difference_between_arrays {

public static void main(String[] args) {
	 int[] nums1 = {1,2,2,1};
	    int[] nums2 = {2,2};
	    find_diff(nums1, nums2);
	}

public static void find_diff(int[] nums1, int[] nums2) {

	HashMap<Integer, Integer> map = new HashMap<>();
	for (int i = 0; i < nums2.length; i++) {
		map.put(nums2[i], 0);
	}

	ArrayList<Integer> list_rep = new ArrayList<>();
	for (int i = 0; i < nums1.length; i++) {
		if (map.containsKey(nums1[i])) {
			int val = map.get(nums1[i]);
			val++;
			map.put(nums1[i], val);
		} else {
			list_rep.add(nums1[i]);
		}
	}

	for (int i = 0; i < nums2.length; i++) {
		int val = map.get(nums2[i]);
		if (val == 0) {
			list_rep.add(nums2[i]);
		}
	}

	for (int i : list_rep) {
		System.out.print(i + "  ");
	}
        
	}
}
}