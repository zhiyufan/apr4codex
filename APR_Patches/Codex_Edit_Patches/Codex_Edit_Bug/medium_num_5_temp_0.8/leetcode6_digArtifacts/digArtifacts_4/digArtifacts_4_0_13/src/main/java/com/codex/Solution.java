package com.codex;

import java.util.*;

public class Solution {

      public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {

        int m = artifacts.length, totalArtifacts = m;
        int[] digCol = new int[dig.length], digRow = new int[dig.length];
        int[] digCol1 = new int[dig.length], digCol2 = new int[dig.length];
        int[] digRow1 = new int[dig.length], digRow2 = new int[dig.length];


        for (int i = 0; i < m; i++) {
            digRow[i] = dig[i][0];
            digCol[i] = dig[i][1];
        }

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3], row1 = artifact[0], row2 = artifact[2];
            digRow[i] = row1;
            digRow1[i] = row1;
            digRow2[i] = row2;
            digCol1[i] = col1;
            digCol2[i] = col2;
            digCol[i] = col1;
        }

        for (int i = 0; i < dig.length; i++) {
            int row = dig[i][0], col = dig[i][1];
            boolean rowCovered = false, colCovered = false;
            for (int j = 0; j < m; j++) {
                if (row >= digRow1[j] && row <= digRow2[j]) {
                    rowCovered = true;
                }
                if (col >= digCol1[j] && col <= digCol2[j]) {
                    colCovered = true;
                }
            }
            if (!rowCovered || !colCovered) {
                totalArtifacts--;
            }
        }
        return totalArtifacts;
    }




}