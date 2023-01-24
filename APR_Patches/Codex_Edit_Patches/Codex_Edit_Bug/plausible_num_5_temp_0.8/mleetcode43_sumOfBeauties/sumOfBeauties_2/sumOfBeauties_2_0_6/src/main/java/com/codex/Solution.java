package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 0) return sum;
        if (nums.length == 1) return 1;
        for (int i = 0; i < nums.length; i++) {
            int rev = nums[i];
            if (i == 0) {
                if (nums[i] > nums[i + 1]) {
                    sum += nums[i];
                }
            } else if (i == nums.length - 1) {
                if (nums[i] > nums[i - 1]) {
                    sum += nums[i];
                }
            } else {
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    sum += nums[i];
                }
            }
        }
        return sum;
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 3, 7};
        System.out.println("The sum of beauties for the given array is: " + sumOfBeauties(nums));
    }
}
}