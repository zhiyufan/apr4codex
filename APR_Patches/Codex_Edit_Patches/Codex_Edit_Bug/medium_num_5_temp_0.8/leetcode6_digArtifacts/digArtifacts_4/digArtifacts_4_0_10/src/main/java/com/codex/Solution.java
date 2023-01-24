package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        // Write your code here
        int m = artifacts.length;
        int count = 0;

        boolean[][] grid = new boolean[n][n];

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int left = artifact[1];
            int right = artifact[3];
            int up = artifact[0];
            int down = artifact[2];

            for (int a = up; a <= down; a++) {
                for (int b = left; b <= right; b++) grid[a][b] = true;
            }
        }

        for (int i = 0; i < dig.length; i++) {
            int x = dig[i][0];
            int y = dig[i][1];

            if (grid[x][y]) grid[x][y] = false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]) ++count;
            }
        }

        return count;
    }

}
}