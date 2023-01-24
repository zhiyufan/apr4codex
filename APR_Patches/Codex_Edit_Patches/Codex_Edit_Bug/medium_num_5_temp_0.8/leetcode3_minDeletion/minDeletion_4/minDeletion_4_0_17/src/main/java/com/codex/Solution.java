package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0;
        if (nums.length > 1) {
            int i = 0;
            while (i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
                i += 2;
            }
            if (nums.length % 2 == 1) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j] == nums[j + 1]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}