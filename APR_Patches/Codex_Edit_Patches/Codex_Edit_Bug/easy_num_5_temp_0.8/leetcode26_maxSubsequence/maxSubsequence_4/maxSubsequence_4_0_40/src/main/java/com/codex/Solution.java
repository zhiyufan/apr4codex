package com.codex;

import java.util.*;

public class Solution {
    // 假定你有一位经常错过班车的朋友，你只好给他买些早高峰期的车票。每天早高峰期的票价为 costs[i] ，
    // 为了让你的朋友不至于一直在为买票苦恼，你只好让他一段时间买一张票，在第一段 k 天中，你让他只能买一张票；
    // 在第二段 k 天中，你让他只能买两张票；依此类推，直到第 N 段。你需要计算出在所有可能的购买方案中，
    // 你的朋友最多能避免花掉多少钱。 输入：days = [1,4,6,7,8,20], costs = [2,7,15]
    // 输出：11
    // 解释：
    // 例如，这里有一种购买通行证的方法，可以让你完成你的旅行计划：
    // 在第 1 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 1 天生效。
    // 在第 3 天，你花了 costs[1] = $7 买了一张为期 7 天的通行证，它将在第 3, 4, ..., 9 天生效。
    // 在第 20 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 20 天生效。
    // 你总共花了 $11，并完成了你计划的每一天旅行。

    public int mincostTickets(int[] days, int[] costs) {
        
        int n = days[days.length - 1];
        int k = days.length;
        int[] dp = new int[n + 1];

        dp[0] = 0;
        int[] index = new int[n + 1];
        index[0] = 0;
        for(int i = 1; i < n + 1; ++i){
            if(i == days[index[i - 1]]){
                dp[i] = Math.min(dp[i - 1] + costs[0], dp[Math.max(0, i - 7)] + costs[1]);
                dp[i] = Math.min(dp[i], dp[Math.max(0, i - 30)] + costs[2]);
                index[i] = index[i - 1] + 1;
            }else{
                dp[i] = dp[i - 1];
                index[i] = index[i - 1];
            }
            // System.out.println(dp[i]);
        }

        return dp[n];
        
    }

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
                last++;
            }
            if(last < i - 1){
                dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
            }else{
                dp[i] = Math.max(dp[i - 1], prefixSum[i]);
            }
            index[i] = last;
        }

        System.out.println(Arrays.toString(dp));
        int[] ans = new int[k];
        int start = index[k];
        for(int i = k - 1; i >= 0; --i){
            while(start < k && prefixSum[k] - prefixSum[start] >= dp[k] - prefixSum[start + 1]){
                start++;
            }
            ans[i] = k - start;
            k = start;
        }

        return ans;

    public static void main(String[] args){
    	int[] a = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
    	System.out.println(Arrays.toString(maxSubsequence(a, 45)));
    }
    }
}