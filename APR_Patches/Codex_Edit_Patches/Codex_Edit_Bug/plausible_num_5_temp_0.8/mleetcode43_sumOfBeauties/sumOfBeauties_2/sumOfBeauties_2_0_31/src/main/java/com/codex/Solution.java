package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = 1;
            int min = 1;
            int max_sub_i = 1;
            int min_sub_i = 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i] && nums[j] > nums[max]) max = j;
            }
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] < nums[i] && nums[k] < nums[min]) min = k;
            }
            for (int p = i - 1; p >= 0; p--) {
                if (nums[p] < nums[i] && nums[p] > nums[min]) min_sub_i = p;
            }
            for (int q = i + 1; q < nums.length; q++) {
                if (nums[q] > nums[i] && nums[q] < nums[max]) max_sub_i = q;
            }
            if (nums[max_sub_i] != nums[min]) {
                sum += max_sub_i - i + 1;
            }
            if (nums[min_sub_i] != nums[max]) {
                sum += i - min_sub_i + 1;
                if (nums[min_sub_i] != nums[min]) {
                    sum -= 1;
                }
            }
        }
        return sum;
    }

    
}