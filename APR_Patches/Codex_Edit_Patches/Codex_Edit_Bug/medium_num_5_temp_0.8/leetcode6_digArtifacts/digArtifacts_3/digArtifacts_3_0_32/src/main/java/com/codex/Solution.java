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
            for (int j = Math.min(artifacts[art][0], artifacts[art][2]); j <= Math.max(artifacts[art][0], artifacts[art][2]); j++) {
                for (int k = Math.min(artifacts[art][1], artifacts[art][3]); k <= Math.max(artifacts[art][1], artifacts[art][3]); k++) {
                    rows[j * n + k]--;
                    cols[j * n + k]--;
                }
            }
        }
        return count;
    }
}