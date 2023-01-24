package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += differences[j];
                if (sum >= lower && sum <= upper) {
                    dp[i] = (dp[i] + dp[j + 1]) % mod;
                }
                if (sum > upper) break;
            }
        }
        return (int)dp[0];
    }
    int dp[][]=new int[n][n];
        
        return sol(s,t,0,s.length()-1,dp);
    }
    public int sol(String s,String t,int i,int j,int[][] dp){
        if(i==s.length()){
            if(j==t.length()){
                return 1;
            }
            return 0;
        }
        if(j==t.length()){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        dp[i][j]=sol(s,t,i+1,j,dp);
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j]+=sol(s,t,i+1,j+1,dp);
        }
        dp[i][j]%=1000000007;
        
        return dp[i][j];
    }
}


    
}