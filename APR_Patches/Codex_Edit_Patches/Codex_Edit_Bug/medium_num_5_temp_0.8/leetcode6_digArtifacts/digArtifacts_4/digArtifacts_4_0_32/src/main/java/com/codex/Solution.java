package com.codex;

import java.util.*;

public class Solution {
  public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0) return artifacts.length;
        int m = artifacts.length, totalArtifacts = m;
        int[] rowList = new int[n], colList = new int[n];

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];
            // System.out.println(row1 + " " + row2 + " " + col1 + " " + col2);
            for (int j = row1; j <= row2; j++) {
                if (rowList[j-1] >= col1 && rowList[j-1] <= col2) {
                    totalArtifacts--;
                    break;
                }
            }
            for (int j = col1; j <= col2; j++) {
                if (colList[j-1] >= row1 && colList[j-1] <= row2) {
                    totalArtifacts--;
                    break;
                }
            }
        }

        for (int i = 0; i < dig.length; i++) {
            int[] digRow = dig[i];
            int row = digRow[0], col = digRow[1];
            if (rowList[row-1] < col) {
                rowList[row-1] = col;
            }
            if (colList[col-1] < row) {
                colList[col-1] = row;
            }
        }
        return totalArtifacts;
    }
}