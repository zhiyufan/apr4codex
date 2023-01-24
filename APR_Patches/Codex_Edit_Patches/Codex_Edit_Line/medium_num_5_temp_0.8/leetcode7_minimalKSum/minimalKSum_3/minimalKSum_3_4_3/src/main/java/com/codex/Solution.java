package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        

        long result = 0;
        int i = 0, j = 0;
        while (i < nums.length && j < k) {
            if (nums[i] <= j + 1) {
                result += nums[i++];
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