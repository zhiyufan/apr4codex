package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        

        int rows = artifacts.length;
        int cols = dig.length;
        int[] range = new int[rows * cols];
        Integer[] idx = new Integer[rows * cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                range[i * cols + j] = Math.max(artifacts[i][0], artifacts[i][2]);
                range[i * cols + j] = Math.max(range[i * cols + j], Math.max(artifacts[i][1], artifacts[i][3]));
            }
        }

        Arrays.setAll(idx, i -> i);

        Arrays.sort(idx, (i, j) -> range[dig[j][0] * n + dig[j][1]] - range[dig[i][0] * n + dig[i][1]]);

        for (int i = 0; i < rows * cols; i++) {
            int art = dig[idx[i]][0] * n + dig[idx[i]][1];
            int ind = dig[idx[i]][0] * n + dig[idx[i]][1];
            if (rows[art] == 0) {
                continue;
            }
            count++;
            range[art] = 0;
            if (artifacts[art][1] < artifacts[art][3]) {
                for (int j = artifacts[art][1]; j <= artifacts[art][3]; j++) {
                    range[art + n * j]--;
                }
            } else {
                for (int j = artifacts[art][3]; j <= artifacts[art][1]; j++) {
                    range[art + n * j]--;
                }
            }
            if (artifacts[art][0] < artifacts[art][2]) {
                for (int j = artifacts[art][0]; j <= artifacts[art][2]; j++) {
                    range[n * j + art]--;
                }
            } else {
                for (int j = artifacts[art][2]; j <= artifacts[art][0]; j++) {
                    range[n * j + art]--;
                }
            }
        }
        return count;
    }
}