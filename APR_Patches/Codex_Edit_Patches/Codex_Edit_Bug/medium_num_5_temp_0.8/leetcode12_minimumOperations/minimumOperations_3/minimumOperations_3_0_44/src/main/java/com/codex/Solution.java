package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int m = minimumOperations(nums);
        System.out.println(m);
    }

    public static int minimumOperations(int[] nums) {
        
        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = dp[0][1] = 0;
        dp[1][0] = dp[1][1] = nums[1] != nums[0] ? 1 : 0;
        for (int i = 2; i < len; ++i) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]) + (nums[i] != nums[i-1] ? 1 : 0);
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }
}
    
}