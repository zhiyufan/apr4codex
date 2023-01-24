package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        long mod = 1000000007;
        long[][] dp = new long[differences.length + 1][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i < differences.length + 1; i++) {
            if (differences[i - 1] == 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * (upper - lower + 1) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower + 1) % mod) % mod;
            } else if (differences[i - 1] > 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * lower % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * upper % mod) % mod;
            } else {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * upper % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * lower % mod) % mod;
            }
        }
        return (int) dp[differences.length][1];
    }
    public static long dp(int[] arr, int n, int[][] dp) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n][arr.length] != -1) {
            return dp[n][arr.length];
        }
        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = (res + dp(arr, n - arr[i], dp)) % MOD;
        }
        return dp[n][arr.length] = res;
    }
    public static long dp(int[] arr, int n) {
        int[][] dp = new int[n + 1][arr.length + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= arr.length; j++) {
                dp[i][j] = -1;
            }
        }
        return dp(arr, n, dp);
    } 
    static long MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        System.out.println(dp(arr, m) % MOD);
    }

    
}