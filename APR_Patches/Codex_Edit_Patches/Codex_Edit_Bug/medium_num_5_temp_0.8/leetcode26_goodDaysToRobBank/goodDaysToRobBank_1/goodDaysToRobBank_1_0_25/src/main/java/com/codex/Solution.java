package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name.substring(0, 1).toUpperCase());
        System.out.println(name.substring(1));

        public static String buildFullName(String name) {
            if (name == null) return null;
            if (name.length() == 0) return "";
            if (name.length() == 1) return name.toUpperCase();
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }


        public static int solve(int[] nums, int low, int high) {
            int[] max = new int[nums.length];
            int[] min = new int[nums.length];
            max[0] = nums[0];
            min[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > 0) {
                    max[i] = max[i - 1] * nums[i];
                    min[i] = min[i - 1] * nums[i];
                } else if (nums[i] == 0) {
                    max[i] = 0;
                    min[i] = 0;
                } else {
                    max[i] = Math.min(min[i - 1] * nums[i], 0);
                    min[i] = Math.min(max[i - 1] * nums[i], 0);
                }
            }
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                maxVal = Math.max(maxVal, max[i]);
            }

            return maxVal;
        }
    
}