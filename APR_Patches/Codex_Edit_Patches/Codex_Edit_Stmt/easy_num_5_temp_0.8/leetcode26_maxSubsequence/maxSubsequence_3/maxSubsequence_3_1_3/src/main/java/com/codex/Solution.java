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

    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (x, y) -> y.length() - x.length());
        List<String> list = new ArrayList<>();
        int sum = 0;
        for (String word : words) {
            int i = 0;
            for (i = 0; i < list.size(); i++) {
                if (list.get(i).matches(word + ".*")) {
                    break;
                }
            }
            if (i == list.size()) {
                list.add(word);
                sum += word.length() + 1;
            }
        }
        return sum;
    }
}