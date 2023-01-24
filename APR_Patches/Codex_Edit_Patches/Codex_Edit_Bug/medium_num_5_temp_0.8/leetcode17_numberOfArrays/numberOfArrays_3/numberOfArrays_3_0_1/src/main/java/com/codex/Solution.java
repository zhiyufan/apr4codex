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



//
// 827775236
//
//
//
    static int a[] = new int[15], T[15][10];
    static int N = 0;
    static int dp[][] = new int[15][10];
     static void initialize(){
         for(int i = 0; i < 15; i++)
             for(int j = 0; j < 10; j++)dp[i][j] = -1;
     }
    static int solve(int i, int j){
        if(j < 0)return 0;
        if(i == N){
            if(j == 0)return 1;
            else return 0;
        }
        if(dp[i][j] != -1)return dp[i][j];
        int ans = 0;
        for(int k = 0; k < 10; k++){
            ans = (ans + solve(i+1, j-k)%1000000007)%1000000007;
        }
        return dp[i][j] = ans;
    }
    static int ans(int n){
         N = 0;
         while(n > 0){
             a[N++] = n%10;
             n /= 10;
         }
         reverse(a, 0, N-1);
         return solve(0, a[0]);
    }
    static void reverse(int a[], int l, int r){
        while(l < r){
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }
    // Complete the solve function below.
    static int solve(int l, int r) {
         initialize();
         return (ans(r)-ans(l-1)+1000000007)%1000000007;
    }
}