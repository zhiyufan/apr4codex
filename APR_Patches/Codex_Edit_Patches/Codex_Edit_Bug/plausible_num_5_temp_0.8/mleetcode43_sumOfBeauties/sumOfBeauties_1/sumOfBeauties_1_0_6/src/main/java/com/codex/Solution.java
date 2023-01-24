package com.codex;

import java.util.*;

public class Solution {
public static int sumOfBeauties(int[] nums) {
    
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    int nowmin = nums[0];
    int nowmax = nums[nums.length - 1];
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > nowmin) {
            left[i] = 1;
        }
        nowmin = Math.min(nums[i], nowmin);
        if (nums[nums.length - 1 - i] < nowmax) {
            right[nums.length - 1 - i] = 1;
        }
        nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
    }
    for (int i = 1; i < nums.length - 1; i++) {
        if (left[i] == 1 && right[i] == 1) {
            res[i] = 2;
        } else if (left[i] == 1 || right[i] == 1) {
            res[i] = 1;
        }
    }
    int sum = 0;
    for (int i = 1; i < res.length - 1; i++) {
        sum += res[i];
    }
    return sum;
}



// 回文最少分割数
// dp[i][j]表示[i,j]之间的字符串最少分割数
public int minCut(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }
    int n = s.length();
    char[] cs = s.toCharArray();
    int[][] dp = new int[n][n];
    for (int i = 0; i < n - 1; i++) {
        dp[i][i] = 0;
        if (cs[i] == cs[i + 1]) {
            dp[i][i + 1] = 0;
        } else {
            dp[i][i + 1] = 1;
        }
    }
    dp[n - 1][n - 1] = 0;
    for (int l = 2; l < n; l++) {
        for (int i = 0; i < n - l; i++) {
            int j = l + i;
            dp[i][j] = dp[i + 1][j - 1];
            if (cs[i] != cs[j]) {
                dp[i][j]++;
            }
            for (int k = i; k <= j; k++) {
                dp[i][j] = Math.min(dp[i][k] + dp[k + 1][j], dp[i][j]);
            }
        }
        return sum;
    }

    
}