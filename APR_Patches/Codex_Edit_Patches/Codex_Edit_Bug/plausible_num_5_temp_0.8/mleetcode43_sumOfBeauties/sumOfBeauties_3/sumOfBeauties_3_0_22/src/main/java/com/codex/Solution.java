package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                sum += 1;
            } 
        }

        for(int i = 1; i < nums.length - 1; i++) {
            if(!(nums[i - 1] < nums[i] && nums[i] < nums[i + 1])) {
                int j = i - 1;
                int k = i + 1;

                while(j >= 0) {
                    if(nums[i] > nums[j]) {
                        int j1 = j;
                        while(j1 >= 0) {
                            if(nums[j1] > nums[j]) {
                                break;
                            }
                            j1--;
                        }
                        if(j1 < 0) {
                            j1 = -1;
                        }
                        j = j1;
                        continue;
                    }
                    j--;
                }
                while(k < nums.length) {
                    if(nums[i] > nums[k]) {
                        int k1 = k;
                        while(k1 < nums.length) {
                            if(nums[k1] > nums[k]) {
                                break;
                            }
                            k1++;
                        }
                        if(k1 >= nums.length) {
                            k1 = nums.length;
                        }
                        k = k1;
                        continue;
                    }
                    k++;
                }

                if((j < 0 && k >= nums.length) || (nums[j] <= nums[i] && nums[i] <= nums[k])) {
                    sum += 2;
                }
            }

        }
        return sum;
    }

    
}