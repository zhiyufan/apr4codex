package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 1) return 2;
        if (nums.length == 2) {
            if(nums[0] > nums[1]) return 2;
            else return 1;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += 1;
            } else if (nums[i] > nums[i + 1] && nums[i] < nums[i - 1]) {
                sum += 1;
            } else {                
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[i] < nums[k]) {
                        sum += 2;
                        break;
                    }
                }
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[i] < nums[j]) {
                        sum += 2;
                        break;
                    }
                }
                if (i == nums.length - 2) {
                    if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                        sum -= 2;
                    }
                }
                if (i == 1) {
                    if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                        sum -= 2;
                    }
                }
            }
        }
        return sum;
    }

    
}