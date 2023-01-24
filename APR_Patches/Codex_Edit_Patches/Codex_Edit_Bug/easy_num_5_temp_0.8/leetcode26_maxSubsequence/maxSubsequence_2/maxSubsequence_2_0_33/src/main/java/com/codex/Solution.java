package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            for (int j = i-k+1; j <= i; j++) {
                res[j-i+k-1] = nums[j];
            }
        }
        return res;
    }


    
}