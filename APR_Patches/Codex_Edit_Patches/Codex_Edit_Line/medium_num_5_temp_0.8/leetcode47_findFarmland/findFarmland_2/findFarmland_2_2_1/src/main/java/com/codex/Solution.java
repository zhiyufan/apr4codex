package com.codex;

import java.util.*;

public class Solution {
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