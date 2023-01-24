package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        int curMax = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < curMax) {
                curMax = nums[i];
            } else {
                result += j + 1;
                j++;
            }
        }

        while (j < k) {
            result += j + 1;
            j++;
        }

        return result;
    }

    
    
}