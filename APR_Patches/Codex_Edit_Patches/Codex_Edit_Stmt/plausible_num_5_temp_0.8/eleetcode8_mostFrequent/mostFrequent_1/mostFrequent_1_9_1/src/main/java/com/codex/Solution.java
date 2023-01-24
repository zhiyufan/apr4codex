package com.codex;

import java.util.*;

public class Solution {
        public static int mostFrequent(int[] nums, int key) {
            

        int count = 0;
        int maxCount = 0;
        int target = 1;

        for (int i = 0; i < nums.length; i++) {
                        target = nums[i + 1];
            if (nums[i] == key) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i + 1]) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    //target = nums[i + 1];
                }
            }
        }

        return target;
    }

    
}