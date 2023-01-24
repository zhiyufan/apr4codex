package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            max[i] = 1;
            min[i] = 1;
        }
        
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    max[i] = Math.max(max[i], max[j] + 1);
                } 
            }
        }

        for(int i = nums.length - 2; i >= 0; i--) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[i]) {
                    min[i] = Math.max(min[i], min[j] + 1);
                } 
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            int curRes = max[i] + min[i] - 1;
            if(curRes > res) {
                res = curRes;
            }
        }
        return res;
    }

    
}