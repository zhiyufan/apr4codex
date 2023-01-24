package com.codex;

import java.util.*;

public class Solution {
int maxUncrossedLines(int[] A, int[] B) {
    int lenA = A.length, lenB = B.length;
    int[][] dp = new int[lenA + 1][lenB + 1];
    for(int i = 0; i < lenA; i++) {
        for(int j = 0; j < lenB; j++) {
            if(A[i] == B[j]) {
                dp[i+1][j+1] = dp[i][j] + 1;
            } else {
                dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
            }
        }
    }
    return dp[lenA][lenB];
}

int maxUncrossedLines(int[] A, int[] B) {
    int lenA = A.length, lenB = B.length;
    if(lenA < lenB) {
        return maxUncrossedLines(B, A);
    }
    int[] dp = new int[lenB + 1];
    for(int i = 0; i < lenA; i++) {
        int prev = 0;
        for(int j = 0; j < lenB; j++) {
            int temp = dp[j + 1];
            if(A[i] == B[j]) {
                dp[j + 1] = prev + 1;
            } else {
                dp[j + 1] = Math.max(dp[j + 1], dp[j]);
            }
            prev = temp;
        }
    }
    return dp[lenB];
}





int findMaxForm(vector<string>& strs, int m, int n) {
    int len = strs.size();
    if(len == 0) {
        return 0;
    }
    vector<vector<int>> dp(m + 1, vector<int>(n + 1, 0));
    
    for(int i = 0; i < len; i++) {
        int count_zeros = 0, count_ones = 0;
        for(char c : strs[i]) {
            if(c == '0') {
                count_zeros++;
            } else if(c == '1') {
                count_ones++;
            }
        }
        for(int j = m; j >= count_zeros; j--) {
            for(int k = n; k >= count_ones; k--) {
                dp[j][k] = max(dp[j][k], dp[j - count_zeros][k - count_ones] + 1);
            }
        }
    }
    return dp[m][n];
}


class Solution {
    vector<vector<int>> dp;
    vector<vector<int>> visited;
    vector<vector<int>> dir;
    int m, n;
    int max_area;
    
    void findArea(int i, int j, int cur_area) {
        if(i < 0 || i >= m) {
            return;
        }
        if(j < 0 || j >= n) {
            return;
        }
        if(dp[i][j] == 0) {
            return;
        }
        if(visited[i][j] == 1) {
            return;
        }
        max_area = max(max_area, cur_area);
        visited[i][j] = 1;
        
        for(int k = 0; k < 4; k++) {
            if(i + dir[k][0] >= 0 && i + dir[k][0] < m && j + dir[k][1] >= 0 && j + dir[k][1] < n){
                if(dp[i + dir[k][0]][j + dir[k][1]] == 1) {
                    findArea(i + dir[k][0], j + dir[k][1], cur_area + 1);
                }
            }
        }
        visited[i][j] = 0;
    }
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        m = grid.size();
        n = grid[0].size();
        dp = grid;
        visited.resize(m, vector<int>(n, 0));
        dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        max_area = INT_MIN;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(dp[i][j] == 1) {
                    findArea(i, j, 1);
                }
            }
        }
        return max_area;
    }

};
}