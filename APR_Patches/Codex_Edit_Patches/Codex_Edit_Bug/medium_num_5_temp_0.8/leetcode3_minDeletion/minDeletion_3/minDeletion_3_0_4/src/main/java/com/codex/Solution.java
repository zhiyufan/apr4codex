package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length - 1; ) {
            int  j=i;
            for (; j < nums.length - 1; j++) {
                if (nums[j] % 2 == 0 && nums[j] == nums[j + 1]) {
                    count++;
                }
            }
            i=j+1;
        }
        return count;
    }

    
}