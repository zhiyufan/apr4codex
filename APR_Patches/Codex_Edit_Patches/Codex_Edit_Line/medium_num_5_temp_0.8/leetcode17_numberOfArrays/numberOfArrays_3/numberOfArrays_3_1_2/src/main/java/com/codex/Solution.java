package com.codex;

import java.util.*;

public class Solution {
    static int numArray(int[] arr, int[] dp) {
        int n = arr.length;
        int mod = (int) (1e9 + 7);

        for (int i = 1; i < n; i++) {
            dp[i] = (dp[i] + dp[i - 1]) % mod;
            if (arr[i] != 0) {
                if (arr[i - 1] == 0) {
                    dp[i] = (dp[i] + dp[i - 1]) % mod;
                } else {
                    int temp = arr[i] * arr[i - 1];
                    if (temp > 0) {
                        if (arr[i] < arr[i - 1]) {
                            dp[i] = (dp[i] + dp[i - 1]) % mod;
                        } else {
                            dp[i] = (dp[i] + dp[i - 2]) % mod;
                        }
                    } else {
                        if (temp == -1) {
                            if (arr[i - 1] == 1) {
                                dp[i] = (dp[i] + dp[i - 2]) % mod;
                            } else {
                                dp[i] = (dp[i] + dp[i - 1]) % mod;
                            }
                        } else {
                            if (arr[i] + arr[i - 1] == 0) {
                                dp[i] = (dp[i] + dp[i - 2]) % mod;
                            } else {
                                dp[i] = (dp[i] + dp[i - 1]) % mod;
                            }
                        }
                    }
                }
            } else {
                dp[i] = (dp[i] + 1) % mod;
            }
        }
        return dp[n - 1];
    }

    public int numSubarrays(int[] arr) {
        
        int[] dp = new int[arr.length];
        dp[0] = 1;
        return numArray(arr, dp);
    }
}