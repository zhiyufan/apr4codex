package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                sum += 1;
            } else {
                int j = i - 1, k = i + 1;
                while(j >= 0 && nums[i] == nums[j]) {
                    j--;
                }
                while(k < nums.length && nums[i] == nums[k]) {
                    k++;
                }
                while(j >= 0) {
                    if(nums[i] > nums[j]) {
                        break;
                    }
                    j -= 1;
                }
                while(k < nums.length) {
                    if(nums[i] > nums[k]) {
                        break;
                    }
                    k += 1;
                }
                if(j < 0 && k >= nums.length) {
                    System.out.println(nums[i]);
                    sum += 2;
                }
            }
        }
        return sum;
    }
}