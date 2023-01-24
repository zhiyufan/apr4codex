package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
    

        int[] result = new int[nums.length];
        if (k == 0) {
            return result;
        } else if (k == 1) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i];
            }
            return result;
        } else if (k >= nums.length) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = -1;
            }
        int sum = 0, index = 0;
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i <= k - 1) {
                sum += nums[i];
                index = i;
            } else {
                index++;
                sum -= nums[i - k];
                sum += nums[i];
            }
            if (index <= 0) {
                result[i] = -1;
            } else if (index < k - 1) {
                result[i] = sum / (index + 1);
            } else {
                result[i] = sum / k;
            }
        }
        return result;
    }

    
}