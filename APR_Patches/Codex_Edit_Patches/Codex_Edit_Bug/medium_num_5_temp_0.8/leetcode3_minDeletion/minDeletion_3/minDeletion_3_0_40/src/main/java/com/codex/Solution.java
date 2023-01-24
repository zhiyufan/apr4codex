package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums, int k) {
        
        int count = 0;
        for (int i = 0; i < nums.length - 1 && count <=k ; i++) {
            if (nums[i] % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        if(count > k)
            return -1;
        else
        return count;
    }

    
}