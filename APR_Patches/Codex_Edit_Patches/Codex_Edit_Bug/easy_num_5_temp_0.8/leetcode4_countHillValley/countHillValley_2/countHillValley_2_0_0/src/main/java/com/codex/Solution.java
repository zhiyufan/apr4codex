package com.codex;

import java.util.*;

public class Solution {
   public static int countHillValley(int[] nums) {
       int sum = 0;
       int i = 0;
       while (i < nums.length - 1) {
           if (nums[i] < nums[i + 1]) {
               while (i < nums.length - 1 && nums[i] <= nums[i + 1]) {
                   i++;
               }
               sum++; // Hill
           } else if (nums[i] > nums[i + 1]) {
               while (i < nums.length - 1 && nums[i] >= nums[i + 1]) {
                   i++;
               }
               sum++; // Valley
           }
           i++;
       }
       return sum;
   }
}