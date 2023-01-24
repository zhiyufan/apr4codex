package com.codex;

import java.util.*;

public class Solution {
    public static int[] kClosest(int[] nums, int k) {
        if (nums.length == 0 || nums == null) return new int[0];
        if (nums.length == 0 || nums == null) return nums[0];
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) curr++;
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    
}