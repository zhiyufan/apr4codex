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
            if (i - k < 0 || i + k > nums.length - 1) {
                result[i] = -1;
            } else if (result[i - k] == 0) {
                sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = sum / (2 * k + 1);
            } else {
                sum = result[i - k] * (2 * k + 1);
                sum -= nums[i - k];
                sum += nums[i + k];
                result[i] = sum / (2 * k + 1);
            }
        }
        return result;
    }


    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        result[k - 1] = sum / k;
        for (int i = k; i < nums.length; i++) {
            if (i - k < 0) {
                sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = sum / (2 * k + 1);
            } else if (i + k > nums.length - 1) {
                sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = sum / (2 * k + 1);
            } else {
                sum = sum - nums[i - k] + nums[i];
                result[i] = sum / k;
            }
        }
        return result;
    }
    

    
    
}