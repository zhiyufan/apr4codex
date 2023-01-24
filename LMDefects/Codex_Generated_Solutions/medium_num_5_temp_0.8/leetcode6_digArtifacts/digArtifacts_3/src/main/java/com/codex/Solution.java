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

        int m = artifacts.length;
        int d = dig.length;
        int[] rows = new int[m];
        int[] cols = new int[m];
        int[] rng = new int[m];
        Integer[] idx = new Integer[d];
        Arrays.setAll(idx, i -> i);
        int count = 0;

        for (int i = 0; i < m; i++) {
            rows[i] = Math.max(artifacts[i][0], artifacts[i][2]);
            cols[i] = Math.max(artifacts[i][1], artifacts[i][3]);
            rng[i] = Math.max(rows[i], cols[i]);
        }

        Arrays.sort(idx, (i, j) -> rng[dig[j][0] * n + dig[j][1]] - rng[dig[i][0] * n + dig[i][1]]);

        for (int i = 0; i < d; i++) {
            int art = dig[idx[i]][0] * n + dig[idx[i]][1];
            if (rows[art] == 0) {
                continue;
            }
            count++;
            rows[art] = 0;
            cols[art] = 0;
            if (artifacts[art][1] < artifacts[art][3]) {
                for (int j = artifacts[art][1]; j <= artifacts[art][3]; j++) {
                    rows[art + n * j]--;
                }
            } else {
                for (int j = artifacts[art][3]; j <= artifacts[art][1]; j++) {
                    rows[art + n * j]--;
                }
            }
            if (artifacts[art][0] < artifacts[art][2]) {
                for (int j = artifacts[art][0]; j <= artifacts[art][2]; j++) {
                    cols[n * j + art]--;
                }
            } else {
                for (int j = artifacts[art][2]; j <= artifacts[art][0]; j++) {
                    cols[n * j + art]--;
                }
            }
        }
        return count;
    }}