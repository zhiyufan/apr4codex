package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long curMin = 0;
        long result = 0;
        int i = 0, j = 0;
        while (i < nums.length && j < k) {
            curMin += nums[i++];
            if (curMin <= j + 1) {
                result += curMin;
            } else {
                curMin = 0;
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