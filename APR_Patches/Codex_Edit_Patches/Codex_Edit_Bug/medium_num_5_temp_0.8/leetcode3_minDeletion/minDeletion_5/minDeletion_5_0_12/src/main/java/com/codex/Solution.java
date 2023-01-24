package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 3, 3, 3, 2, 4};
        int count = minDeletion(nums);
        System.out.println(count);
    }
    
}