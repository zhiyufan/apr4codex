package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        /** You are given a 0-indexed m x n binary matrix land where a 0 represents a hectare of forested land and a 1 represents a hectare of farmland.
         * To keep the land organized, there are designated rectangular areas of hectares that consist entirely of farmland. These rectangular areas are called groups. No two groups are adjacent, meaning farmland in one group is not four-directionally adjacent to another farmland in a different group.
         * land can be represented by a coordinate system where the top left corner of land is (0, 0) and the bottom right corner of land is (m-1, n-1). Find the coordinates of the top left and bottom right corner of each group of farmland. A group of farmland with a top left corner at (r1, c1) and a bottom right corner at (r2, c2) is represented by the 4-length array [r1, c1, r2, c2].
         * Return a 2D array containing the 4-length arrays described above for each group of farmland in land. If there are no groups of farmland, return an empty array. You may return the answer in any order.
         */
        if (land == null || land.length == 0 || land[0] == null || land[0].length == 0) return new int[0][0];
        int m = land.length, n = land[0].length;
        int[][] result = new int[m * n][4];
        int iResult = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 0) continue;
                result[iResult][0] = i;
                result[iResult][1] = j;
                result[iResult][2] = i;
                result[iResult][3] = j;
                dfsFindFarmland(land, i, j, iResult, result);
                iResult++;
            }
        }
        return Arrays.copyOf(result, iResult);
    }
    private static void dfsFindFarmland(int[][] land, int i, int j, int iResult, int[][] result) {
        land[i][j] = 0;
        if (i > 0 && land[i - 1][j] == 1) {
            result[iResult][0] = Math.min(result[iResult][0], i - 1);
            dfsFindFarmland(land, i - 1, j, iResult, result);
        }
        if (i < land.length - 1 && land[i + 1][j] == 1) {
            result[iResult][2] = Math.max(result[iResult][2], i + 1);
            dfsFindFarmland(land, i + 1, j, iResult, result);
        }
        if (j > 0 && land[i][j - 1] == 1) {
            result[iResult][1] = Math.min(result[iResult][1], j - 1);
            dfsFindFarmland(land, i, j - 1, iResult, result);
        }
        if (j < land[0].length - 1 && land[i][j + 1] == 1) {
            result[iResult][3] = Math.max(result[iResult][3], j + 1);
            dfsFindFarmland(land, i, j + 1, iResult, result);
        }
        if (i > 0 && j > 0 && land[i - 1][j - 1] == 1) {
            result[iResult][0] = Math.min(result[iResult][0], i - 1);
            result[iResult][1] = Math.min(result[iResult][1], j - 1);
            dfsFindFarmland(land, i - 1, j - 1, iResult, result);
        }
        if (i > 0 && j < land[0].length - 1 && land[i - 1][j + 1] == 1) {
            result[iResult][0] = Math.min(result[iResult][0], i - 1);
            result[iResult][3] = Math.max(result[iResult][3], j + 1);
            dfsFindFarmland(land, i - 1, j + 1, iResult, result);
        }
        if (i < land.length - 1 && j > 0 && land[i + 1][j - 1] == 1) {
            result[iResult][2] = Math.max(result[iResult][2], i + 1);
            result[iResult][1] = Math.min(result[iResult][1], j - 1);
            dfsFindFarmland(land, i + 1, j - 1, iResult, result);
        }
        if (i < land.length - 1 && j < land[0].length - 1 && land[i + 1][j + 1] == 1) {
            result[iResult][2] = Math.max(result[iResult][2], i + 1);
            result[iResult][3] = Math.max(result[iResult][3], j + 1);
            dfsFindFarmland(land, i + 1, j + 1, iResult, result);
        }
    }


    }