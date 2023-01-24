package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        /** There is an n x n 0-indexed grid with some artifacts buried in it. You are given the integer n and a 0-indexed 2D integer array artifacts describing the positions of the rectangular artifacts where artifacts[i] = [r1i, c1i, r2i, c2i] denotes that the ith artifact is buried in the subgrid where:
         * (r1i, c1i) is the coordinate of the top-left cell of the ith artifact and
         * (r2i, c2i) is the coordinate of the bottom-right cell of the ith artifact.
         * You will excavate some cells of the grid and remove all the mud from them. If the cell has a part of an artifact buried underneath, it will be uncovered. If all the parts of an artifact are uncovered, you can extract it.
         * Given a 0-indexed 2D integer array dig where dig[i] = [ri, ci] indicates that you will excavate the cell (ri, ci), return the number of artifacts that you can extract.
         * The test cases are generated such that:
         * No two artifacts overlap.
         * Each artifact only covers at most 4 cells.
         * The entries of dig are unique.
         */
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
                }
                if (digCol[j] >= col1 && digCol[j] <= col2) {
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