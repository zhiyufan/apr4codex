package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        /** You are given a 0-indexed m x n binary matrix land where a 0 represents a hectare of forested land and a 1 represents a hectare of farmland.
         * To keep the land organized, there are designated rectangular areas of hectares that consist entirely of farmland. These rectangular areas are called groups. No two groups are adjacent, meaning farmland in one group is not four-directionally adjacent to another farmland in a different group.
         * land can be represented by a coordinate system where the top left corner of land is (0, 0) and the bottom right corner of land is (m-1, n-1). Find the coordinates of the top left and bottom right corner of each group of farmland. A group of farmland with a top left corner at (r1, c1) and a bottom right corner at (r2, c2) is represented by the 4-length array [r1, c1, r2, c2].
         * Return a 2D array containing the 4-length arrays described above for each group of farmland in land. If there are no groups of farmland, return an empty array. You may return the answer in any order.
         */
        int m = land.length;
        int n = land[0].length;
        int[][] ans = new int[m * n][4];
        int numGroups = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (land[r][c] == 1) {
                    int topLeftR = r, topLeftC = c;
                    int bottomRightR = r, bottomRightC = c;
                    expandGroup(land, r, c, bottomRightR, bottomRightC);
                    ans[numGroups++] = new int[]{topLeftR, topLeftC, bottomRightR, bottomRightC};
                }
            }
        }
        return Arrays.copyOfRange(ans, 0, numGroups);
    }

    }