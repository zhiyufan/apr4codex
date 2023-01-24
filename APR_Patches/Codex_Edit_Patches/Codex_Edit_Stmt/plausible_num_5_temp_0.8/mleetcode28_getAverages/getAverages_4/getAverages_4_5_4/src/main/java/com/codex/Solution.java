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

    public static boolean isPalindrome(int[] nums) {
        
        int end = nums.length - 1;
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != nums[end]) {
                break;
            }
            end--;
        }
        if (i >= nums.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int[] findArrayQuadruplet(int[] arr, int s) {
        
        if (arr.length < 4) {
            return new int[]{};
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                int left = j + 1;
                int right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == s) {
                        return new int[]{arr[i], arr[j], arr[left], arr[right]};
                    } else if (sum > s) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return new int[]{};
    }
    
    public static String shortestPalindrome(String str) {
        
        StringBuilder palindrome = new StringBuilder();
        for (int i = str.length() - 1; i < 0; i--) {
            if (str.charAt(i) == str.charAt(0)) {
                palindrome.append(str.substring(i, str.length()));
                palindrome.reverse();
                palindrome.append(str);
                if (isPalindrome(palindrome.toString())) {
                    return palindrome.toString();
                } else {
                    palindrome = new StringBuilder();
                }
            }
        }
        return palindrome.toString();
    }
    
    public static boolean isPalindrome(String str) {
    int end = str.length() - 1;
    int i;
    for (i = 0; i < str.length(); i++) {
        if (str.charAt(i) != str.charAt(end)) {
            break;
        }
        end--;
    }
    if (i >= str.length()) {
        return true;
    } else {
        return false;
    }
}
    
    
}