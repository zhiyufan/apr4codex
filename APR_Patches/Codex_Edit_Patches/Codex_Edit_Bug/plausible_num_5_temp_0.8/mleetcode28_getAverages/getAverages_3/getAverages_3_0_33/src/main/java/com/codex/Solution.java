package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length - 2 * k + 1];
        for (int i = k; i < nums.length - k + 1; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                sum += nums[j];
            }
            avgs[i] = sum / (2*k + 1);
        }
        return avgs;
    }



//     getAverages([1,3,2,6,-1,4,1,8,2], 4); 
// # => [ 2.666667, 2.8, 2.6, 3.6, 2.8 ]





    
}