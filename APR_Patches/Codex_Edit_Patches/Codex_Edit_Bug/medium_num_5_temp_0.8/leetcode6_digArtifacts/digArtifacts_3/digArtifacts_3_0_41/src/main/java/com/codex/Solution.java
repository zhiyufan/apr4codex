package com.codex;

import java.util.*;

public class Solution {
public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        

      int m = artifacts.length;
      int d = dig.length;
      int[] row = new int[m];
      int[] col = new int[m];
      Integer[] idx = new Integer[d];
      Arrays.setAll(idx, i -> i);
      int[] rng = new int[d];
      int count = 0;

      for (int i = 0; i < m; i++) {
          row[i] = Math.max(artifacts[i][0], artifacts[i][2]);
          col[i] = Math.max(artifacts[i][1], artifacts[i][3]);
          rng[i] = Math.max(row[i], col[i]);
      }

      Arrays.sort(idx, (i, j) -> rng[dig[j][0] * n + dig[j][1]] - rng[dig[i][0] * n + dig[i][1]]);

      for (int i = 0; i < d; i++) {
          int art = dig[idx[i]][0] * n + dig[idx[i]][1];
          if (row[art] == 0) {
              continue;
          }
          count++;
          row[art] = 0;
          col[art] = 0;
          if (artifacts[art][1] < artifacts[art][3]) {
              for (int j = artifacts[art][1]; j <= artifacts[art][3]; j++) {
                  row[art + n * j]--;
              }
          } else {
              for (int j = artifacts[art][3]; j <= artifacts[art][1]; j++) {
                  row[art + n * j]--;
              }
          }
          if (artifacts[art][0] < artifacts[art][2]) {
              for (int j = artifacts[art][0]; j <= artifacts[art][2]; j++) {
                  col[n * j + art]--;
              }
          } else {
              for (int j = artifacts[art][2]; j <= artifacts[art][0]; j++) {
                  col[n * j + art]--;
              }
          }
        }
      return count;
  }
}