package com.codex;

import java.util.*;

public class Solution {
   public static int sumOfBeauties(int[] nums) {
       int sum = 0;
       for (int i = 0; i < nums.length; i++) {
           if (isBeauty(nums, i)) {
               sum += 2;
           }
       }
       
       return sum;
   }
   
   public static boolean isBeauty(int[] nums, int i) {
       int curr = nums[i];
       boolean condition1 = true;
       boolean condition2 = true;
       for (int j = 0; j < i; j++) {
           if (nums[j] > curr) {
               condition1 = false;
               break;
           }
       }
       for (int k = i; k < nums.length - 1; k++) {
           if (nums[k] < curr) {
               condition1 = false;
               break;
           }
       }
       
       if (i == 0 || i == nums.length - 1) {
           condition2 = false;
       } else {
           condition2 = nums[i - 1] > curr || nums[i + 1] < curr;
       }
       
       return condition1 || condition2;
   }
}