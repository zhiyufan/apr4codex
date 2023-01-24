package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums, int k) {
        
        if (k == 0) return 0;
        
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = i;
            while (temp - 1 >= 0 && k > 0 && nums[temp - 1] < nums[temp]) {
                nums[temp] = nums[temp - 1];
                temp--;
                k--;
            }
        }
        if (nums.length % 2 == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}