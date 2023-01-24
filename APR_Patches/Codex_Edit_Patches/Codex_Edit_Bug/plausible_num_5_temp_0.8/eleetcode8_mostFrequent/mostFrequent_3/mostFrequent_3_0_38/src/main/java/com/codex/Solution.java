package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) { 
        if (nums.length == 0) {
            return -1;
        }

        int res = -1;
        int maxCount = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                count++;
            } else {
                count = 0;
            }

            if (count > maxCount) {
                maxCount = count;
                res = i;
            }
        }

        if (maxCount == 1) {
            return -1;
        }

        return nums[res];
    }
        }

        return maxNum;
    }

    
}