package com.codex;

import java.util.*;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = m == 0 ? 0 : matrix[0].length;
        List<Integer> result = new ArrayList<>(m * n);
        int r1 = 0, r2 = m - 1, c1 = 0, c2 = n - 1;
        while (result.size() < m * n) {
            for (int i = c1; i <= c2; i++) {
                result.add(matrix[r1][i]);
            }
            r1++;
            for (int i = r1; i <= r2; i++) {
                result.add(matrix[i][c2]);
            }
            c2--;
            if (result.size() < m * n) {
                for (int i = c2; i >= c1; i--) {
                    result.add(matrix[r2][i]);
                }
            }
            r2--;
            if (result.size() < m * n) {
                for (int i = r2; i >= r1; i--) {
                    result.add(matrix[i][c1]);
                }
            }
            c1++;
        }

        return result;
    }
}