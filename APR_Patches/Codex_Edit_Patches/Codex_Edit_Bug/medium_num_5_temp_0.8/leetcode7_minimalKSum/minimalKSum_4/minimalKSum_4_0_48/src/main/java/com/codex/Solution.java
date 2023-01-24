package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int curr = 1;
        long sum = 0;
        while (k > 0 && curr <= nums[right]) {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == curr) {
                    break;
                } else if (nums[mid] > curr) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (nums[left] > curr) {
                k--;
                sum += curr * (left - right);
                curr++;
            } else {
                sum += nums[left] * (left - right);
                curr = nums[left] + 1;
            }
        }
        
        return sum;
    }

    
}