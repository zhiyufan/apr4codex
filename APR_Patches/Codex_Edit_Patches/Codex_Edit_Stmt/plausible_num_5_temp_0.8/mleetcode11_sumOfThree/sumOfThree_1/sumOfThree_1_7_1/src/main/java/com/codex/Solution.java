package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (i != 0 && nums[i] == nums[i-1]) continue;

            // optimization
//            if (nums[i] > 0) break;

            int l = i+1;
            int r = nums.length-1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l-1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r+1]) {
                        r--;
                    }
                }
            }
        }
        return result;
    }

    public static long[] sumOfThree(long num) { 
        List<Long> result = new ArrayList<>();
        if (num < 3) {
            return new long[0];
        }
        long low = 1;
        long high = 2;

        long sum = 3;

        while (high < num) { 
            if (sum < num) {
                high++;
                sum += high; 
            } else if (sum > num) { 
                sum -= low;
                low++; 
            } else {
                for (long i = low; i <= high; i++) {
                    result.add(i);
                }
                break;
            }
        }

        return result.stream().mapToLong(i -> i).toArray();
    }

    
}