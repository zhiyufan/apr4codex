package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
       int nowmin = nums[0];
       int nowmax = nums[nums.length - 1];
       int[] res = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] > nowmin) {
               res[i] += 1;
           }
           nowmin = Math.min(nums[i], nowmin);
       }
       for (int i = 0; i < nums.length; i++) {
           if (nums[nums.length - 1 - i] < nowmax) {
               res[nums.length - 1 - i] += 1;
           }
           nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
       }
       int sum = 0;
       for (int i = 0; i < res.length; i++) {
           if (res[i] == 2) {
               sum++;
           }
       }
       return sum;
    }

    
}