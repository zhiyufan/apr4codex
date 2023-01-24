package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int N = grid.length;
        int[][] dp = new int[m][N];
        for (int i = 0; i < N; i++){
            dp[0][i] = position[i];
        }
        for (int i = 1; i < m; i++){
            for (int j = i; j < N; j++){
                if (j == i){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                    continue;
                }
                if (dp[i - 1][j - 1] == 0){
                    continue;
                }
            }
            
        }
        return dp[m - 1][N - 1];
    }
}
}