package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        result[0] = sum / k;
        for (int i = 1; i < result.length; i++) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            result[i] = sum / k;
        }
        return result;
    }
    
    
    public static int[] getAveragesTwo(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int[] pre = new int[nums.length + 1];
        int sum = 0;
        for (int i = 1; i < pre.length; i++) {
            sum += nums[i - 1];
            if (i >= k) {
                pre[i] = sum;
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = (pre[i + k] - pre[i]) / k;
        }
        return result;
    }
}