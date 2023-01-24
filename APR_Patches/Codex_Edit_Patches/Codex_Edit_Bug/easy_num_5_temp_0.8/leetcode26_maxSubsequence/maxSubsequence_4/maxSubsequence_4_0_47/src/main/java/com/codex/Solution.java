package com.codex;

import java.util.*;

public class Solution {
#include<iostream>
#include<vector>
using namespace std;

int main()
{
    vector<int> nums = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30 };
    int k = 5;

        if (nums.size() == 0 || k == 0)
            return nums;

        int n = nums.length;

        if (n <= k)
            return nums;

        vector<int> prefixSum = vector<int>(n + 1,0);
        for (int i = 1; i <= n; i++)
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];

        vector<int> dp = vector<int>(k + 1, 0);
        vector<int> index = vector<int>(k + 1, 0);

        for(int i = 1; i <= k; ++i){
            int last = index[i - 1];
            while(last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]){
                last++;
            }
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
}