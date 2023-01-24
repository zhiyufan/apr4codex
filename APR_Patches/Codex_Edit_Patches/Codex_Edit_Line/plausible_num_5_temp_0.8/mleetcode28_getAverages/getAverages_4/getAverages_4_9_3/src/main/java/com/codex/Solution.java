package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i - k < 0 || i + k >= nums.length) {
                result[i] = -1;
            } else if (result[i - k] == 0) {
                sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = sum / (2 * k + 1);
            } else {
                sum = result[i - k] * (2 * k + 1);
                sum -= nums[i - k];
                sum += nums[i + k];
                result[i] = sum / (2 * k + 1);
            }
        }
        return result;
    }

        public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 0) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !isValidChar(str.charAt(left))) {
                left++;
            }
            while (left < right && !isValidChar(str.charAt(right))) {
                right--;
            }
            if (left < right) {
                if (toLowerCase(str.charAt(left)) != toLowerCase(str.charAt(right))) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }


    
}