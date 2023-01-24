package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        

        int m = artifacts.length;
        int d = dig.length;
        int[] rows = new int[m];
        int[] cols = new int[m];
        int[] rng = new int[m];
        Integer[] idx = new Integer[d];
        Arrays.setAll(idx, i -> i);
        int count = 0;

        for (int i = 0; i < m; i++) {
            rows[i] = Math.abs(artifacts[i][0] - artifacts[i][2]) + 1;
            cols[i] = Math.abs(artifacts[i][1] - artifacts[i][3]) + 1;
            rng[i] = rows[i] * cols[i];
        }

        Arrays.sort(idx, (i, j) -> rng[dig[j][0] * n + dig[j][1]] - rng[dig[i][0] * n + dig[i][1]]);

        for (int i = 0; i < d; i++) {
            int art = dig[idx[i]][0] * n + dig[idx[i]][1];
            if (rows[art] == 0) {
                continue;
            }
            int a = artifacts[art][0];
            int b = artifacts[art][1];
            int c = artifacts[art][2];
            int d = artifacts[art][3];
            count++;
            rows[art] = 0;
            cols[art] = 0;
            if (b < d) {
                for (int j = b; j <= d; j++) {
                    rows[art + n * j]--;
                }
            } else {
                for (int j = d; j <= b; j++) {
                    rows[art + n * j]--;
                }
            }
            if (a < c) {
                for (int j = a; j <= c; j++) {
                    cols[n * j + art]--;
                }
            } else {
                for (int j = c; j <= a; j++) {
                    cols[n * j + art]--;
                }
            }
        }
        return count;
    }
}