package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] memo = new int[m + 1][n + 1];
        for (int[] row : memo) Arrays.fill(row, Integer.MAX_VALUE);
        memo[m - 1][n] = 1;
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                memo[r][c] = Math.max(1, Math.min(memo[r][c + 1], memo[r + 1][c]) - dungeon[r][c]);
            }
        }
        return memo[0][0];
    }

}
}