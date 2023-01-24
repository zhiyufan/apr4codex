package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 1; i < length - 1; i++) {
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                int first = i / 2;
                int second = first + 1;
                if (nums[first] == nums[second]) {
                    count++;
                }
            }
        }
        return count;
    }

    
    
}