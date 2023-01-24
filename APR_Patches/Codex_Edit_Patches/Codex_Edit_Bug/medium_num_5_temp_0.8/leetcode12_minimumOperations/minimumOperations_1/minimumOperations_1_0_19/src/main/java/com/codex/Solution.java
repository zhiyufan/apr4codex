package com.codex;

import java.util.*;

public class Solution {
    public static int numMusicPlaylists(int N, int L, int K) {
        
        int dp[][] = new int[L + 1][N + 1];
        int mod = (int) 1e9 + 7;
        for(int i = 0; i <= N; i++){
            dp[0][i] = 0;
            dp[1][i] = (long)i * (i - 1) / 2 % mod;
        }
        for(int i = 0; i <= L; i++){
            dp[i][0] = 0;
            dp[i][1] = 1;
        }
        for(int i = 2; i <= L; i++){
            for(int j = 2; j <= N; j++){
                int c1 = (j - K) * dp[i - 1][j];
                int c2 = (j - 1) * dp[i - 1][j - 1];
                dp[i][j] = (c1 % mod + c2 % mod) % mod;
                // dp[i][j] = ((long)j * dp[i - 2][j - 2] % mod + (long)j * (j - 1) / 2 % mod) % mod;
            }
        }
        return dp[L][N];
    }

    
}