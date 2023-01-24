package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        int[] dp = new int[Math.max(1, k)];
//        int[] dp = new int[k]; // wrong, if k == 0, you got error
        dp[0] = nums[0];
        for (int i = 1; i < k; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i]);
        }
        for (int i = k; i < n; i++) {
            if (nums[i] > dp[k - 1]) {
                dp[0] = dp[1];
                for (int j = 1; j < k - 1; j++) {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }


// Solution 2.  
// https://www.1point3acres.com/bbs/thread-556303-1-1.html
// 每次加可能的元素，用当前的sum和之前的sum比，取长度小的。

// solution 3. 
// https://www.1point3acres.com/bbs/thread-556303-1-1.html
// 思路是比较直观的，直接比较k个数中最大值减去最小值，最小值在前面的和最小值在后面的
// 下面的代码是参考了网上的，直接用了TreeSet这个结构，运行效率应该更加高
}