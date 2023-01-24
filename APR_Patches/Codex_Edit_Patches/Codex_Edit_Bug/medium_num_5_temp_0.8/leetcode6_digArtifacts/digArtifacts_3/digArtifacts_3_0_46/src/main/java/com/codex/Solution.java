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
            int x = dig[idx[i]][0];
            int y = dig[idx[i]][1];
            if (rows[x * n + y] == 0) {
                continue;
            }
            count++;
            rows[x * n + y] = 0;
            cols[x * n + y] = 0;
            if (artifacts[x * n + y][0] < artifacts[x * n + y][2]) {
                for (int j = artifacts[x * n + y][0]; j <= artifacts[x * n + y][2]; j++) {
                    rows[j * n + y]--;
                }
            }
            else {
                for (int j = artifacts[x * n + y][2]; j <= artifacts[x * n + y][0]; j++) {
                    rows[j * n + y]--;
                }    
            }
            if (artifacts[x * n + y][1] < artifacts[x * n + y][3]) {
                for (int j = artifacts[x * n + y][1]; j <= artifacts[x * n + y][3]; j++) {
                    cols[x * n + j]--;
                }    
            }
            else {
                for (int j = artifacts[x * n + y][3]; j <= artifacts[x * n + y][1]; j++) {
                    cols[x * n + j]--;
                }
            }
        }
        return count;
    }
}