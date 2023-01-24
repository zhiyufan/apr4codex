package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                int current = nums[i + 1];
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] < current) {
                        i = j - 1;
                        count++;
                        break;
                    }
                    current = nums[j];
                }
            } else {
                int current = nums[i + 1];
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] > current) {
                        i = j - 1;
                        count++;
                        break;
                    }
                    current = nums[j];
                }
            }
        }
        return count;
    }
}
}