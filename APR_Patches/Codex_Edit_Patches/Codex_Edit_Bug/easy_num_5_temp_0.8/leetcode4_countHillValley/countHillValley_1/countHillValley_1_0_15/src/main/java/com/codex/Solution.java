package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
        }
        return count;
    }



    //https://www.geeksforgeeks.org/count-subarrays-given-sum/
    public static int contSubArraysGivenSum(int[] nums, int n) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            sum = sum + num;
            if (map.containsKey(sum - n)) {
                count += map.get(sum - n);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }


    public static int findMaxLengthSubarrayWithSameNumberOf0And1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max_length = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if (map.containsKey(sum)) {
                max_length = Math.max(max_length, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max_length;
    }


    //https://www.geeksforgeeks.org/maximum-length-subarray-sum-k/
    public static int lenthOfSubArrayWithGivenSum(int[] arr, int k) {
        int sum = 0;
        int n = arr.length;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            sum = sum + arr[j];
            if (sum == k) {
                maxLength = Math.max(maxLength, j + 1);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, j);
            }
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, j - map.get(sum - k));
            }
        }
        return maxLength;
    }




    //https://www.geeksforgeeks.org/maximum-length-subarray-sum-k/
    public static int lenthOfSubArrayWithGivenSum(int[] arr, int k) {
        int sum = 0;
        int n = arr.length;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            sum = sum + arr[j];
            if (sum == k) {
                maxLength = Math.max(maxLength, j + 1);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, j);
            }
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, j - map.get(sum - k));
            }
        }
        return maxLength;
    }
    
}