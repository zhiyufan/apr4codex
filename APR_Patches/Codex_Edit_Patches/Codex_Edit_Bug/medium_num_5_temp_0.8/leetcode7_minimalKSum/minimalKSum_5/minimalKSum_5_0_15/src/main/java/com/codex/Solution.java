package com.codex;

import java.util.*;

public class Solution {
    
    public static long minimalKSum(int[] nums, int k) {   
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        
        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == pos) {
                pos++;
            } else if (nums[i] < pos) {
                continue;
            } else {
                sum += pos;
                k--;
                pos++;
                i--;
            }
        }
        sum = (long)sum + (pos + k - 1) * k / 2;
        return sum;
    }




    public static long minimalKSum(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int size = nums.length;
        
        int count = 0;
        long sum = 0;
        int i = 0;
        
        while (count < k && i < size) {
            int n = nums[i];
            while (count < k && n > 0) {
                count++;
                sum += n;
                n--;
            }
            i++;
        }
        
        return sum;
    }
    
    
}