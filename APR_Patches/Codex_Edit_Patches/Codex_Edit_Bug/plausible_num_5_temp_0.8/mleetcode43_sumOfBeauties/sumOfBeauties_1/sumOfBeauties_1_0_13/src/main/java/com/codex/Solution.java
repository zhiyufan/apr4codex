package com.codex;

import java.util.*;

public class Solution {
    public static int[] theBeautifier(int[] nums){
        int[] left = new int[nums.length + 2];
        int[] right = new int[nums.length + 2];
        int nowmin = nums[1];
        int nowmax = nums[nums.length - 2];
        int[] res = new int[nums.length + 2];
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i] > nowmin) { 
                left[i] = 1; 
            }
            nowmin = Math.min(nums[i], nowmin);
            if (nums[nums.length - i] < nowmax) {
                right[nums.length - i + 1] = 1; 
            }
            nowmax = Math.max(nums[nums.length - i], nowmax);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (left[i] == 1 && right[i] == 1) {res[i] = 2;} 
            else if (left[i] == 1 || right[i] == 1) {res[i] = 1;}
        }

        for (int i = left.length - 2; i > 0 ; i--) {
            if (left[i] == 1 && nums[i] >= nowmin) {
                nowmin = Math.min(nums[i], nowmin);
            } else {
                left[i] = 0;
            }
            if (right[i] == 1 && nums[i] <= nowmax) {
                nowmax = Math.max(nums[i], nowmax);
            } else {
                right[i] = 0;
            }
        }
        int sum = 0;
        for (int i = 1; i <= res.length - 2; i++) {sum += res[i];}
        return sum;
    }

    
}