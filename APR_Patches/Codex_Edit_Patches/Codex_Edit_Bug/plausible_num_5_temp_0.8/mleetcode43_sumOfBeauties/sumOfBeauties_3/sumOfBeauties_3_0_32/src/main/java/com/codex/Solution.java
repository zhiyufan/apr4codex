package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int j = i - 1;
            int k = i + 1;
            while(j >= 0) {
                if(nums[i] > nums[j]) {
                    break;
                }
                j--;
            }
            while(k < nums.length) {
                if(nums[i] > nums[k]) {
                    break;
                }
                k++;
            }
            if(j < 0 && k >= nums.length) {
                int l = 0;
                while(l < nums.length) {
                    if(nums[l] > nums[i]) {
                        sum += nums[i];
                        break;
                    }
                    l++;
                }
                break;
            }
            if(nums[i] > nums[j] && nums[k] > nums[i]) {
                sum += 1;
            }
        }
        return sum;
    }

    
}