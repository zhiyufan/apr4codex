package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int matrix[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.print(sum(matrix));
    }

    public static long sum(int[][] matrix) {
        long[][] dp = new long[matrix.length + 1][matrix[0].length+1];
        for (int i=matrix.length-1; i>=0; i--) {
            for (int j=matrix[0].length-1; j>=0; j--) {
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]) + matrix[i][j];
            }
        }
        return dp[0][0];
    }
}
}