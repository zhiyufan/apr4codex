package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {

    private static long gridGame(int[][] grid) {

        int[][] dp = new int[2][grid[0].length];
        dp[0][0] = grid[0][0];
        dp[1][0] = grid[1][0];
        for (int i = 1; i < grid[0].length; i++) {
            // Calculate the 1st level
            dp[0][i] = Math.min(dp[0][i - 1], dp[1][i - 1]);
            // Calculate the 2nd level
            dp[1][i] = dp[0][i - 1] + grid[1][i];
        }

        return Math.min(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numCases; i++) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int[][] matrix = new int[2][cols];
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    matrix[j][k] = scanner.nextInt();
                }
            }
            scanner.nextLine();
            System.out.println(gridGame(matrix));
        }

        scanner.close();
    }
}

    public static long gridGame(int[][] grid) {
        
        int[][] dp = new int[2][grid[0].length];
        dp[0][0] = 0;
        dp[1][0] = 0;
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
            dp[1][i] = dp[0][i - 1] + grid[1][i];
        }

        return Math.max(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }
}