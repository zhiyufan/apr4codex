package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        if (nums == null){
            return 0;
        }
        int length = nums.length;
        if (length <= 1){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
    
}