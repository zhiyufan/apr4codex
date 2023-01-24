package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = {4,4,4,4};
        System.out.println(minimumOperations(nums));
    }
    
    public static int minimumOperations(int[] arr) {
        
        int length = arr.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 0);
        for (int i = 1; i < length; i++) {
            if (dp[i] == 0) {
                dp[i] = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            }
            if (i - 2 >= 0) {
                dp[i] = Math.min(dp[i - 2] + Math.abs(arr[i] - arr[i - 2]), dp[i]);
            }
        }
        return dp[n - 1];
    }

    
}