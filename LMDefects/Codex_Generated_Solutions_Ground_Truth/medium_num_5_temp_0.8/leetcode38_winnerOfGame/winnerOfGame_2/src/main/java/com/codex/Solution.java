package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        /** There are n pieces arranged in a line, and each piece is colored either by 'A' or by 'B'. You are given a string colors of length n where colors[i] is the color of the ith piece.
         * Alice and Bob are playing a game where they take alternating turns removing pieces from the line. In this game, Alice moves first.
         * Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'. She is not allowed to remove pieces that are colored 'B'.
         * Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'. He is not allowed to remove pieces that are colored 'A'.
         * Alice and Bob cannot remove pieces from the edge of the line.
         * If a player cannot make a move on their turn, that player loses and the other player wins.
         * Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins.
         */
        if (colors == null || colors.length() == 0) {
            return false;
        }
        if (colors.length() == 1) {
            return true;
        }
        int n = colors.length();
        int[][] dp = new int[2][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] + (colors.charAt(i - 1) == 'B' ? 1 : 0);
        }
        for (int i = 1; i <= n - 1; i++) {
            int cur = i % 2, pre = (i - 1) % 2;
            dp[cur][i] = dp[pre][i] + (colors.charAt(i - 1) == 'A' ? 1 : 0);
            for (int j = i + 1; j <= n; j++) {
                dp[cur][j] = Math.min(
                        dp[pre][j - 1] + (colors.charAt(j - 1) == 'B' ? 1 : 0),
                        dp[pre][j] + (colors.charAt(j - 1) == 'A' ? 1 : 0)
                );
            }
        }
        int cur = (n - 1) % 2, pre = (n - 2) % 2;
        return dp[cur][n] <= dp[pre][n - 1];
    }

    }