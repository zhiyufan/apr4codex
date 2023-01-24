package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        while (k > 0) {
            if (Arrays.binarySearch(nums, curr) < 0) {
                sum+=curr;
                curr++;
            }
            k--;
        }
        return sum;
    }

    
}