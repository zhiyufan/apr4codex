package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {


        int m = artifacts.length;
        int d = dig.length;
        int[] rows = new int[m]; // no. of artifacts that can be found in a column
        int[] cols = new int[m]; // no. of artifacts that can be found in a row
        int[] rng = new int[m]; // max range of an artifact
        Integer[] idx = new Integer[d]; // index of dig request
        Arrays.setAll(idx, i -> i);
            // find all rows and columns that contain an artifact
            // initialize the max range
        int count = 0; // no. of artifacts that are found

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
    }
}