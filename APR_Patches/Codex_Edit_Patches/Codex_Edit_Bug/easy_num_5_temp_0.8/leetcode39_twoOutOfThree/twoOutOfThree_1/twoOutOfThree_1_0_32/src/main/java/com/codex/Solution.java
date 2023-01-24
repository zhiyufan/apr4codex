package com.codex;

import java.util.*;

public class Solution {
package CS610;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class hw2 {

	public static void main(String[] args) {
		int[] num1 = {1,2,7,4,5,8,7,4,4,2,7,10};
		int[] num2 = {3,7,3,1,8,7,4,3,3,7,1,9};
		int[] num3 = {7,2,1,8,7,3,3,1,7,9,9,2};
		hw2 test = new hw2();
		List<Integer> result = test.twoOutOfThree(num1, num2, num3);
		System.out.println(result);
	}
	
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			list1.add(nums1[i]);
			list2.add(nums2[i]);
			list3.add(nums3[i]);
		}
		list1.retainAll(list2);
		list2.retainAll(list3);
		result.addAll(list1);
		result.addAll(list2);
        return result;
    }

	}
}
}