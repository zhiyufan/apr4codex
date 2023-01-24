package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0){
            return 0;
        }
        int N = M.length;
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (M[i][j] == 1){
                    uf.union(i, j);
                }
            }
        }
        return uf.count;
    }
}

class UnionFind{
    public int[] father;
    public int count;
    public UnionFind(int n){
        this.count = n;
        father = new int[n];
        for (int i = 0; i < n; i++){
            father[i] = i;
        }
    }
    
    public int find(int x){
        if (father[x] == x){
            return x;
        }
        return father[x] = find(father[x]);
    }
    
    public void union(int a, int b){
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b){
            father[root_a] = root_b;
            count--;
        }
    }
}

public static int minOperations(int[][] grid, int x) {

        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        if (grid[0][0] % x == 0){
            dp[0][0] = grid[0][0] / x;
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (dp[i][j] == -1){
                    continue;
                }
                int target = grid[i][j];
                if (i != 0){
                    if (dp[i - 1][j] != -1){
                        if (grid[i - 1][j] > target){
                            if ((grid[i - 1][j] - target) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (grid[i - 1][j] - target) / x);
                            }
                        }else if (grid[i - 1][j] < target){
                            if ((target - grid[i - 1][j]) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (target - grid[i - 1][j]) / x);
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                        }
                    }
                }
                if (j != 0){
                    if (dp[i][j - 1] != -1){
                        if (grid[i][j - 1] > target){
                            if ((grid[i][j - 1] - target) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (grid[i][j - 1] - target) / x);
                            }
                        }else if (grid[i][j - 1] < target){
                            if ((target - grid[i][j - 1]) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (target - grid[i][j - 1]) / x);
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                        }
                    }
                }
            }
        }
        return (dp[N - 1][M - 1] == -1) ? -1 : dp[N - 1][M - 1];
    }
}