package com.codex;

import java.util.*;

public class Solution {
    for (int i = 0; i < n; i++) {
            int start = i;
            int end = i + (n - 1 - i) / 2;
            for (int j = start; j <= end; j++) {
                 int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
}