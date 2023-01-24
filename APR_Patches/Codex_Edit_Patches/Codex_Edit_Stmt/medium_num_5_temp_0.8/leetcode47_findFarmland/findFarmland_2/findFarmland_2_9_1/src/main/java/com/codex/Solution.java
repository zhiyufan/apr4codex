package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
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

    
    public int[][] findFarmland(int[][] land) {
        // Write your code here
        int[][] res = new int[land.length * land[0].length][4];
        int iIndex = 0;
        for (int i = 0; i < land.length; ++i) {
            for (int j = 0; j < land[0].length; ++j) {
                if (land[i][j] == 0) continue;
                
                res[iIndex] = dfs(land, i, j);
                ++iIndex;
            }
        }
        
        return Arrays.copyOf(res, iIndex);
    }
    
    int[] dfs(int[][] land, int x, int y) {
        int[] res = new int[] {x, y, x, y};
        land[x][y] = 0;
        
        if (x - 1 >= 0 && land[x - 1][y] == 1) { res[0] = Math.min(res[0], dfs(land, x - 1, y)[0]); }
        if (y - 1 >= 0 && land[x][y - 1] == 1) { res[1] = Math.min(res[1], dfs(land, x, y - 1)[1]); }
        if (x + 1 < land.length && land[x + 1][y] == 1) { res[2] = Math.max(res[2], dfs(land, x + 1, y)[2]); }
        if (y + 1 < land[0].length && land[x][y + 1] == 1) { res[3] = Math.max(res[3], dfs(land, x, y + 1)[3]); }
        
        return res;
    }


    
}