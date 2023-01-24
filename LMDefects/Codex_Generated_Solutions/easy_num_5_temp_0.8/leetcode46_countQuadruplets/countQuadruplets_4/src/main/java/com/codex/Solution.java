package com.codex;

import java.util.*;

public class Solution {
    public static int countQuadruplets(int[] nums) {
        /** Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:
         * nums[a] + nums[b] + nums[c] == nums[d], and
         * a < b < c < d
         */
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int k = j + 1, l = n - 1;
                while (k < l){
                    if (nums[i] + nums[j] + nums[k] + nums[l] == 0){
                        count++;
                        k++;
                        l--;
                    }
                    else if (nums[i] + nums[j] + nums[k] + nums[l] < 0){
                        k++;
                    }
                    else {
                        l--;
                    }
                }
            }
        }
        return count;
    }

    }