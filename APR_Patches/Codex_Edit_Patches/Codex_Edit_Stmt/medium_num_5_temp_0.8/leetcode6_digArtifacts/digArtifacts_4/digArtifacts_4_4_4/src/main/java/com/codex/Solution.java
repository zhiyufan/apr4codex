package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {

        if (dig.length == 0) return artifacts.length;
        int m = artifacts.length, totalArtifacts = m;
        int[] digRow = new int[dig.length];
        int[] digCol = new int[dig.length];

        for (int i = 0; i < dig.length; i++) {
            digRow[i] = dig[i][0];
            digCol[i] = dig[i][1];
        }

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];
            boolean rowCovered = false, colCovered = false;
            for (int j = 0; j < digRow.length; j++) {
                if (digRow[j] >= row1 && digRow[j] <= row2) {
                    rowCovered = true;
                    break;
                }
                if (digCol[j] >= col1 && digCol[j] <= col2) {
                    colCovered = true;
                    break;
                }
            }
            if (!rowCovered || !colCovered) {
                totalArtifacts--;
            }
        }
        return totalArtifacts;
    }
}