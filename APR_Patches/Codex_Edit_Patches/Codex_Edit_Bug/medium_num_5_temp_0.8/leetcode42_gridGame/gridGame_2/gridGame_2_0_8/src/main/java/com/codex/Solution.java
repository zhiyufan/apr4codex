package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Main {

    public int gridGame(int[][] grid) {
        Arrays.sort(grid[0]);
        Arrays.sort(grid[1]);

        int[][] dp = new int[2][grid[0].length];
        dp[0][0] = 0;
        dp[1][0] = 0;

        boolean turn = true;
        int index = 0;
        while (index < grid[0].length) {
            if (turn) {
                dp[0][index] = Math.max(dp[0][index], dp[1][index]);
                dp[1][index] = dp[0][index] + grid[1][index];
            } else {
                int i = index;
                while (i < grid[0].length && grid[0][i] < grid[1][index]) {
                    i++;
                }
                if (i - 1 >= 0) {
                    if (dp[0][i - 1] == dp[0][index]) {
                        dp[1][i - 1] = Integer.MAX_VALUE;
                    }
                    dp[0][i - 1] = Math.max(dp[0][i - 1], dp[1][i - 1]);
                    dp[1][i - 1] = dp[0][i - 1] + grid[1][i];
                    index = i - 1;
                } else {
                    dp[0][i] = Math.max(dp[0][i], dp[1][i]);
                    dp[1][i] = dp[0][i] + grid[1][i];
                    index = i;
                }
            }
            turn = !turn;
        }


        int max = 0;
        for (int i = 0; i < dp[0].length; i++) {
            max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
        }
        return max;
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.gridGame(new int[][]{{2, 2}, {2, 2}});
    }
}
}