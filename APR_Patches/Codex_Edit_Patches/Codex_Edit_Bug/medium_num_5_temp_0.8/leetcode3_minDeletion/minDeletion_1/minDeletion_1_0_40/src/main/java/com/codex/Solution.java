package com.codex;

import java.util.*;

public class Solution {
  
    public static int minDeletion(int[] nums) {
        int now = 0;
        int next = 0;
        int[] array = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            if ((Math.abs(nums[index]) % 2) == 0) {
                if (nums[index] > 0) {
                    array[now] = nums[index];
                    now++;
                } else {
                    array[nums.length - 1 - next] = nums[index];
                    next++;
                }
            }
        }
        return count;
    }

    
}