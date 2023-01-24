package com.codex;

import java.util.*;

public class Solution {
    //输入一个土地，1代表土地，0代表水，找到所有连接的土地的最大矩形区域，输出可能有多个
    //第一列和第三列是纵向坐标，第二列和第四列是横向坐标
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length == 0 || land[0] == null || land[0].length == 0) return new int[0][0];
        int m = land.length, n = land[0].length;
        int[][] result = new int[m * n][4];
        int iResult = 0;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 0) continue;
                x1 = i;
                x2 = i;
                y1 = j;
                y2 = j;
                dfsFindFarmland(land, i, j, x1, x2, y1, y2);
                result[iResult] = new int[]{x1, y1, x2, y2};
                iResult++;
            }
        }
        return Arrays.copyOfRange(result, 0, iResult);
    }
    private static void dfsFindFarmland(int[][] land, int i, int j, int x1, int x2, int y1, int y2) {
        land[i][j] = 0;
        if (i > 0 && land[i - 1][j] == 1) {
            x1 = Math.min(x1, i - 1);
            dfsFindFarmland(land, i - 1, j, x1, x2, y1, y2);
        }
        if (i < land.length - 1 && land[i + 1][j] == 1) {
            x2 = Math.max(x2, i + 1);
            dfsFindFarmland(land, i + 1, j, x1, x2, y1, y2);
        }
        if (j > 0 && land[i][j - 1] == 1) {
            y1 = Math.min(y1, j - 1);
            dfsFindFarmland(land, i, j - 1, x1, x2, y1, y2);
        }
        if (j < land[0].length - 1 && land[i][j + 1] == 1) {
            y2 = Math.max(y2, j + 1);
            dfsFindFarmland(land, i, j + 1, x1, x2, y1, y2);
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