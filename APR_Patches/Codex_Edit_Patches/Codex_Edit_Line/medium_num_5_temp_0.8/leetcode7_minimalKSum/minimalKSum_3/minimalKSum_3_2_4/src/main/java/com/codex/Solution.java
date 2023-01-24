package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int i = 0, j = 0;
        while (i < nums.length && j < k) {
            if (nums[i] <= j + 1) {
                result += nums[i++];
                System.out.println("adding");
            } else {
                result += j + 1;
                j++;
            }
        }
            System.out.println("adding");


        while (j < k) {
            result += j + 1;
            j++;
        }

        return result;
    }

    
    
}