package com.codex;

import java.util.*;

public class Solution {
public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {


        int m = artifacts.length;
        int d = dig.length;
        int[] rows = new int[m];
        int[] cols = new int[m];
        Integer[] idx = new Integer[d];
        Arrays.setAll(idx, i -> i);
        int count = 0;

        for (int i = 0; i < m; i++) {
            rows[i] = Math.max(artifacts[i][0], artifacts[i][2]);
            cols[i] = Math.max(artifacts[i][1], artifacts[i][3]);
        }

        Arrays.sort(idx, (i1, i2) -> {
            int v1 = Math.max(rows[dig[i1][0] * n + dig[i1][1]], cols[dig[i1][0] * n + dig[i1][1]]);
            int v2 = Math.max(rows[dig[i2][0] * n + dig[i2][1]], cols[dig[i2][0] * n + dig[i2][1]]);
            return v1 - v2;
        });

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
    }
}