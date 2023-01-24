package com.codex;

import java.util.*;

public class Solution {
  public static int sumOfBeauties(int[] nums) {
        // Write your code here
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = nums[0];
        for(int i = 1; i < len; i++) {
            left[i] = Math.max(nums[i], left[i - 1]);
        }
        right[len - 1] = nums[len - 1];
        for(int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(nums[i], right[i + 1]);
        }
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == left[i] && nums[i] == right[i]) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int sumOfBeauties2(int[] nums) {
        // Write your code here
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        int[] left = new int[len];
        Arrays.fill(left, Integer.MIN_VALUE);
        int[] right = new int[len];
        Arrays.fill(right, Integer.MIN_VALUE);
        for(int i = len - 1; i > 0; i--) {
            if(nums[i - 1] >= left[i]) {
                left[i - 1] = nums[i - 1];
            } else {
                left[i - 1] = left[i];
            }
        }
        for(int i = 1; i < len; i++) {
            if(nums[i] >= right[i - 1]) {
                right[i] = nums[i];
            } else {
                right[i] = right[i - 1];
            }
        }
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == left[i] && nums[i] == right[i]) {
                sum += nums[i];
            }
        }
        return sum;
    }



    public static int sumOfBeauties3(int[] nums) {
        // Write your code here
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < len; i++) {
            if(nums[i - 1] < nums[i]) {
                left[i] = Math.max(nums[i], left[i - 1]);
            } else {
                left[i] = Math.max(max, left[i - 1]);
                max = Math.max(max, nums[i]);
            }
        }
        right[len - 1] = nums[len - 1];
        max = nums[len - 1];
        for(int i = len - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                right[i] = Math.max(nums[i], right[i + 1]);
            } else {
                right[i] = Math.max(max, right[i + 1]);
                max = Math.max(max, nums[i]);
            }
        }
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == left[i] && nums[i] == right[i]) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int sumOfBeauties4(int[] nums) {
        // Write your code here
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        int[] left = new int[len];
        Arrays.fill(left, Integer.MIN_VALUE);
        int[] right = new int[len];
        Arrays.fill(right, Integer.MIN_VALUE);
        for(int i = len - 1; i > 0; i--) {
            if(nums[i - 1] >= left[i]) {
                left[i - 1] = nums[i - 1];
            } else {
                left[i - 1] = left[i];
            }
        }
        for(int i = 1; i < len; i++) {
            if(nums[i] >= right[i - 1]) {
                right[i] = nums[i];
            } else {
                right[i] = right[i - 1];
            }
        }
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == left[i] && nums[i] == right[i]) {
                sum += nums[i];
                }
            }
        }
        return sum;
    }

    
}