package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {

    int n = nums.length;

    if(n < k){
        return new int[0];
    }

    int[] prefixSum = new int[n + 1];
    for(int i = 1; i <= n; ++i){
        prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
    }

    int[] dp = new int[k + 1];
    int[] index = new int[k + 1];

    for(int i = 1; i <= k; ++i){
        int last = index[i - 1];
        while(last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]){
        dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
        index[i] = last;
    }
    int[] ans = new int[k];
    int start = index[k];
    for(int i = k - 1; i >= 0; --i){
        while(start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]){
            start++;
        }
        ans[i] = k - start;
        k = start;
    }

    return ans;
}

/*

public static int[] maxSubsequence(int[] nums, int k) {
    if(nums == null || nums.length == 0) {
        return new int[]{};
    }
    int n = nums.length;
    int[][] dp = new int[n + 1][k + 1];
    int[][] path = new int[n + 1][k + 1];
    int[] res = new int[k];
    for(int i = 1; i < n + 1; ++i) {
        for(int j = 1; j < k + 1; ++j) {
            dp[i][j] = dp[i - 1][j];
            path[i][j] = i - 1;
            for(int t = i - 1; t >= j - 1; --t) {
                if(dp[t][j - 1] + nums[i - 1] > dp[i][j - 1]) {
                    dp[i][j] = dp[t][j - 1] + nums[i - 1];
                    path[i][j] = t;
                }
            }
        }
    }
    int p = n;
    for(int i = k - 1; i >= 0; --i) {
        res[i] = path[p][k - i] + 1;
        p = path[p][k - i];
    }
    return res;
}

*/





public static int[] maxSubsequence(int[] nums, int k) {

    int n = nums.length;

    if (n < k) {
        return new int[0];
    }

    int[] prefixSum = new int[n + 1];
    for (int i = 1; i <= n; ++i) {
        prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
    }

    int[] dp = new int[k + 1];
    int[] index = new int[k + 1];

    for (int i = 1; i <= k; ++i) {
        int last = index[i - 1];
        while (last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]) {
            last++;
        }
        dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
        index[i] = last;
    }
    int[] ans = new int[k];
    int start = index[k];
    for (int i = k - 1; i >= 0; --i) {
        while (start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]) {
            start++;
        }
        ans[i] = k - start;
        k = start;
    }

    return ans;
}

/*

public static int[] maxSubsequence(int[] nums, int k) {
    List<Integer> ans = new ArrayList<>();
    int n = nums.length;
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; ++i) {
        dp[i] = dp[i - 1] + nums[i - 1];
    }

    int start = n;
    int d = k;
    while (k >= 1) {
        while (start > 0 && dp[start] - dp[start - 1] < dp[n] - dp[start]) {
            start--;
            last++;
        }

        ans.add(start);
        k--;
        n = start;
        start--;
    int[] ret = new int[d];
    for (int i = d - 1; i >= 0; --i) {
        ret[i] = ans.get(d - i - 1);
    }
    return ret;
}

*/
    }
}