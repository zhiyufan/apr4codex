package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        /*
        min(i) = min(i-1)*k+min(i-2)*k+...+min(1)*k+min(0)*k
        min(i) = min(i-1)*k+min(1)
        min(i) = min(1)+(i-1)min(1)+k
        
        min(i,j) = min(i)*j+min(j)
        
        min(n*k) = min(n)*k+min(k);
        
        */
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr = nums[i];
            } else if (nums[i] == curr) curr++;
        }
        while (k > 0) {
            sum+=curr;
            k--;
        }
        return sum;
    }

    
}