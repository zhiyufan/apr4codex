package com.codex;

import java.util.*;

public class Solution {
/*
 * You are given an array of n elements. Now we are going to choose some elements from the array and put them into a new array.
 * We want to make the new array as large as possible. So, our definition of large is:
 * if we give each element a value of 1 and each non-chosen element a value of -1, we want the sum of the new array to be as large as possible.
 * To be clear, elements can be either part of the new array or not, but we can’t pick half of an element and put it into the new array.
 * You are given the array, the number of elements in the new array k, and the maximum value of any element in the array m.
 * You are required to find the order you should choose the elements from the array. That is, if you choose elements in the order a1, a2, ..., ak,
 * then the new array should be as large as possible. If there are multiple such orders, then choose the one that contains the first element,
 * then the second element and so on.
 *
 * Input:
 * First line is T, the number of the test cases. (1 <= T <= 100)
 * For each test case, there are three numbers n, k and m, followed by n numbers ai, (1 <= n <= 100,000, 1 <= k <= n, 1 <= m <= 1,000,000,000,
 * |ai| <= m), representing the array.
 *
 * Output:
 * T lines, each line contains a permutation of the integers from 1 to n.
 *
 * Example:
 * Input:
 * 1
 * 5 2 5
 * -2 3 2 -4 4
 *
 * Output:
 * 1 2
 *
 * Explanation:
 * The largest array we can have is a1, a4, with a sum of 1 + 4 = 5
 */

  /*
  * The program uses O(n) extra space and O(nk) time complexity.
  */
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