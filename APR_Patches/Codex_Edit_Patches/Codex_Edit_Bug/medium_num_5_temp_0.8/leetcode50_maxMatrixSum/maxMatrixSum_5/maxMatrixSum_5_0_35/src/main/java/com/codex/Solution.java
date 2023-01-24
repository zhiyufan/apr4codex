package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>

struct pair { int x, y; };

int dp[1010][1010];
int matrix[1010][1010];

int sum(struct pair a, struct pair b) {
    return dp[a.x][a.y] - dp[a.x][b.y - 1] - dp[b.x - 1][a.y] + dp[b.x - 1][b.y - 1];
}

main() {
    int n, m, x, y, i, j, k, l;
    scanf("%d%d", &n, &m);
    for (i = 1; i <= n; i++)
        for (j = 1; j <= m; j++)
            scanf("%d", &matrix[i][j]);
    for (i = 1; i <= n; i++)
        for (j = 1; j <= m; j++)
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i][j];
    long long result = 0;
    for (i = 1; i <= n; i++)
        for (j = 1; j <= m; j++)
            for (k = 1; k <= n; k++)
                for (l = 1; l <= m; l++)
                    if (sum(i, j) == sum(k, l)) {
                        if (result < sum(i, j))
                            result = sum(i, j);
                    }
    printf("%lld\n", result);
}

    public static long maxMatrixSum(int[][] matrix) {
        

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] matrixSum = new int[rows][cols];

        matrixSum[0][0] = matrix[0][0];

        for(int i=1;i<rows;i++) {
            matrixSum[i][0] = matrixSum[i-1][0] + matrix[i][0];
        }

        for(int j=1;j<cols;j++) {
            matrixSum[0][j] = matrixSum[0][j-1] + matrix[0][j];
        }

        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                matrixSum[i][j] = matrix[i][j] + Math.max(matrixSum[i-1][j],matrixSum[i][j-1]);
            }
        }

        long maxSum = Long.MIN_VALUE;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(maxSum<matrixSum[i][j]) {
                    maxSum = matrixSum[i][j];
                }
            }
        }

        return maxSum;
    }
}