package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] getAverages(int[] nums, int k) {
        

        double[] result = new double[nums.length - k + 1];
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int index = 0;
        result[index++] = sum / k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            result[index++] = sum / k;
        }
        return result;
    }

    
}