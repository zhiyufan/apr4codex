package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = k - 1; i < nums.length; i++) {
            int sum = dp[i];
            if (i - k >= 0) {
                sum = sum - dp[i - k];
            }
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, end - k + 1, end + 1);
    }

    public void minWindow(String s, String t) {
        int left, right;
        left = right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int required = map.size();
        int formed = 0;
        int[] res = {-1, 0, 0};
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).intValue() == map.get(c).intValue()) {
                    formed++;
                }
            }
            right++;
            while (left <= right && formed == required) {
                c = s.charAt(left);
                if (res[0] == -1 || right - left + 1 < res[0]) {
                    res[0] = right - left + 1;
                    res[1] = left;
                    res[2] = right;
                }
                if (map.containsKey(c)) {
                    window.put(c, window.get(c) - 1);
                    if (window.get(c).intValue() < map.get(c).intValue()) {
                        formed--;
                    }
                }
                left++;
            }
        }
        return s.substring(res[1], res[2] + 1);
    }
    
}