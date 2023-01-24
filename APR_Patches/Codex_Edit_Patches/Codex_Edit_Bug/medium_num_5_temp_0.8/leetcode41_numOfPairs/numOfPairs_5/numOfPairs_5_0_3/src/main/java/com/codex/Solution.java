package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        Arrays.sort(nums, String::compareTo);
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.valueOf(nums[i] + nums[j]) == Integer.valueOf(target)) ans++;
                if (Integer.valueOf(nums[j] + nums[i]) == Integer.valueOf(target)) ans++;
            }
        }
        return ans;
    }



Input: nums = ["abc","abc","abc","abc"], target = "abcabcabcabc"
Output: 1
Explanation:
The 4 occurrences of "abc" can be rearranged to "abcabcabcabc", but this is not a valid way to multiply "abc" to get "abcabcabcabc".

Input: nums = ["ab","ac","bc"], target = "db"
Output: 1
Explanation:
The 3 occurrences of "ab", "ac" and "bc" can be rearranged to "db", but this is not a valid way to multiply "abc" to get "db".

Input: nums = ["abc","abc","abc","abc","abc"], target = "abcabcabcabcabcabc"
Output: 2
Explanation:
The 5 occurrences of "abc" can be rearranged to "abcabcabcabcabcabc" or "abcabcabcabcabcabc".




    public static int numOfPairs(String[] nums, String target) {
        int pairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i].equals(nums[j])) pairs++;
                if (nums[i].length() > nums[j].length()) {
                    if (nums[i].startsWith(nums[j])) {
                        if (numOfPairs(nums, target, i, nums[j].length(), 0) == target.length()/nums[j].length()) {
                            pairs++;
                        }
                    }
                } else if (nums[i].length() < nums[j].length()) {
                    if (nums[j].startsWith(nums[i])) {
                        if (numOfPairs(nums, target, j, nums[i].length(), 0) == target.length()/nums[i].length()) {
                            pairs++;
                        }
                    }
                } else {
                    if (nums[i].equals(nums[j]) && numOfPairs(nums, target, i, nums[i].length(), 0) == target.length()/nums[i].length()) {
                        pairs++;
                    }
                }
            }
        }
        return pairs;
    }

    private static int numOfPairs(String[] nums, String target, int i, int length, int index) {
        if (index >= target.length()) return 0;
        
        int ans = 0;
        for (int j = i; j < nums.length; j++) {
            if (index + length > target.length()) return 0;

            if (target.substring(index, index + length).equals(nums[j])) {
                ans += 1 + numOfPairs(nums, target, j, length, index + length);
            }
        }
        return ans;
    }
    
}