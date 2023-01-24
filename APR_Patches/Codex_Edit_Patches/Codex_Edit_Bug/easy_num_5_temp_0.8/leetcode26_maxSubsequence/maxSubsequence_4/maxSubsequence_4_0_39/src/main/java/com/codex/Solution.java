package com.codex;

import java.util.*;

public class Solution {
public class Main
{
    public static void main(String[] er)
    {
        int[] ar = {1, 2, 12, -5, -6, 50, 3};
        MaxSumSubsequence mss = new MaxSumSubsequence();
        //System.out.print(mss.find(ar));
        mss.find(ar);
    }
}

class MaxSumSubsequence
{
    Integer[][] m;
    public void find(int[] ar)
    {
        m = new Integer[ar.length][ar.length];

        System.out.print(findRecursive(ar, 0, ar.length-1));
    }

    private int findRecursive(int[] ar, int l, int r)
    {
        if (m[l][r] != null)
        {
            System.out.println("reusing "+l+" "+r);
            return m[l][r];
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