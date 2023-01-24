package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            arr[i] = Integer.valueOf(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == Integer.valueOf(target)) ans++;
            }
        }
        return ans;
    }

    
}