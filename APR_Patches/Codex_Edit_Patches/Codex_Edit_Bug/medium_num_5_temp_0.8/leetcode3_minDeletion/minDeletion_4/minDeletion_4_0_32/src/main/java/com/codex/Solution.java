package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0;
        int j = 1;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[j]) {
                count++;
            } else {
                j = i + 2;
            }
        }

        if (nums.length % 2 == 1 && count == nums.length / 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}