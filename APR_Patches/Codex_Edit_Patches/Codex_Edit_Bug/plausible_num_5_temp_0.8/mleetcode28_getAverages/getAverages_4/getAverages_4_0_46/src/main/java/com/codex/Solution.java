package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
            result[i] = sum / k;
            sum = sum - nums[i] + (i + k) < nums.length ? nums[i + k] : 0;
        }
        return result;
    }

    
}