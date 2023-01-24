package com.codex;

import java.util.*;

public class Solution {
package main;

    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }
    public static void main(String args[]){
    	int[] nums = {1, 2, 3, 2, 4, 2, 5, 2, 6, 2, 7, 2};
        int result = countHillValley(nums);
        System.out.print(result);
    }

    
}