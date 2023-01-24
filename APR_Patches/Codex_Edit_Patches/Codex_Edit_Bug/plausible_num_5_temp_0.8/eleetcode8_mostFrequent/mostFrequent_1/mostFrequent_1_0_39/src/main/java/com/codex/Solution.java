package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        int maxCount = 0;
        int count = 1;
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    target = nums[i];
                }
            }
        }
        return target;
    }

    
}