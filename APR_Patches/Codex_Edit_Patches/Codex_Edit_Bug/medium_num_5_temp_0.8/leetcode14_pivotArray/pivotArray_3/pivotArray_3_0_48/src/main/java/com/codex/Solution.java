package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length;
        while (equal < greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
            }
            else if (nums[equal] == pivot) {
                ++equal;
            }
            else {
                swap(nums, equal, --greater);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        //boundary cases
        if (nums1 == null || nums1.length == 0) {
            return nums1;
        }
        if (nums2 == null || nums2.length == 0) {
            return nums2;
        }
        
        if (nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.containsKey(nums1[i])) {
                int count = hashMap.get(nums1[i]);
                hashMap.put(nums1[i], ++count);
            }
            else {
                hashMap.put(nums1[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int count = hashMap.getOrDefault(nums2[i], 0);
            if (count > 0) {
                list.add(nums2[i]);
                hashMap.put(nums2[i], --count);
            }
        }
        
        int[] output = new int[list.size()];
        int index = 0;
        for (int num : list) {
            output[index++] = num;
        }
        return output;
        
    }

    
}