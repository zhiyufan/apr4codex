package com.codex;

import java.util.*;

public class Solution {
    
public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 2;
        int[] result = getAverages(nums, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    
    public static int[] getAverages(int[] nums, int k) throws IllegalArgumentException {
        if (nums == null || k > nums.length - 1) {
            throw new IllegalArgumentException();
        }
        

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i - k - 1 < 0) {
                sum = 0;
                for (int j = i - k; j <= j + k; j++) {
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

    
}