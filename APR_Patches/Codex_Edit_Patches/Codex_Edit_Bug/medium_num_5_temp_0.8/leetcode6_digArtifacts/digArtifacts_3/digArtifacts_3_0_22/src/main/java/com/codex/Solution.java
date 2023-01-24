package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        

        int m = artifacts.length;
        int d = dig.length;

        int[][][] rowcol = new int[m][][];
        int[] rng = new int[m];

        for (int i = 0; i < m; i++) {
            rowcol[i] = new int[][] {new int[4], new int[4]};
            for (int j = 0; j < 4; j++) {
                if (j % 2 == 0) {
                    rowcol[i][0][j] = Math.max(artifacts[i][j], artifacts[i][(j + 1) % 4]);
                } else {
                    rowcol[i][1][j] = Math.max(artifacts[i][j], artifacts[i][(j + 1) % 4]);
                }
            }
            
        }

        int[] row0 = new int[m];
        int[] col0 = new int[m];

        Arrays.setAll(row0, i -> dig[i][0]);
        Arrays.setAll(col0, i -> dig[i][1]);

        int[] diff_r = new int[m];
        int[] diff_c = new int[m];
        for (int i = 0; i < m; i++) {
            diff_r[i] = rowcol[i][0][0] - rowcol[i][0][3];
            diff_c[i] = rowcol[i][1][2] - rowcol[i][1][1];
        }

        int[] vals = new int[m];
        for (int i = 0; i < m; i++) {
            vals[i] = diff_r[i] * diff_c[i];
        }

        Arrays.sort(row0, (i, j) -> vals[j] - vals[i]);
        Arrays.sort(col0, (i, j) -> vals[j] - vals[i]);

        int[] rows0 = new int[m];
        int[] cols0 = new int[m];

        for (int i = 0; i < m; i++) {
            rows0[i] = rowcol[row0[i]][0][0];
            cols0[i] = rowcol[col0[i]][1][3];
        }


        int count = 0;

        for (int i = 0; i < m; i++) {
            rng[i] = Math.max(rows0[i], cols0[i]);
        }

        int[] rows = new int[m];
        int[] cols = new int[m];

            if (rng[i] == 0) {
                continue;
            }
            count++;
            int r = row0[i];
            int c = col0[i];
            rows[r] = 0;
            cols[c] = 0;
            if (rowcol[r][0][1] < rowcol[r][0][3]) {
                for (int j = rowcol[r][0][1]; j <= rowcol[r][0][3]; j++) {
                    rows[r + n * j]--;
                }
            } else {
                for (int j = rowcol[r][0][3]; j <= rowcol[r][0][1]; j++) {
                    rows[r + n * j]--;
                }
            }
            if (rowcol[c][1][0] < rowcol[c][1][2]) {
                for (int j = rowcol[c][1][0]; j <= rowcol[c][1][2]; j++) {
                    cols[n * j + c]--;
                }
            } else {
                for (int j = rowcol[c][1][2]; j <= rowcol[c][1][0]; j++) {
                    cols[n * j + c]--;
                }
            }
        
        return count;
    }
}