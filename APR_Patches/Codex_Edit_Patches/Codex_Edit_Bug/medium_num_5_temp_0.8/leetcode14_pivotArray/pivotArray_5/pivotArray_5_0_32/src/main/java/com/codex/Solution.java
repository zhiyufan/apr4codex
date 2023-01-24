package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int right = n - 1, left = 0;
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }


    public int equal(int[] arr) {
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int next = (arr[i] + 1) % arr.length;
            int prev = (arr[i] + arr.length - 1) % arr.length;
            if (map.containsKey(next) && map.containsKey(prev)) {

                if (result == -1) {
                    result = map.get(prev) + map.get(next) + 1;
                }
                else {
                    result = Math.min(result, map.get(prev) + map.get(next) + 1);
                }
            }
            else if (map.containsKey(next) || map.containsKey(prev)) {
                if (result == -1) {
                    result = map.getOrDefault(next, map.get(prev)) + 1;
                }
                else {
                    result = Math.min(result, map.getOrDefault(next, map.get(prev)) + 1);
                }
            }
            map.put(arr[i], i);
        }
        return result;
    }
}