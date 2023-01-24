package com.codex;

import java.util.*;

public class Solution {
    public static long getMaxTotal(int[][] matrix, int i, int j, int n) {
		if (i == 0 && j == 0) return matrix[i][j];
		if (i == 0) return matrix[i][j] + getMaxTotal(matrix, i, j - 1, n);
		if (j == 0) return matrix[i][j] + getMaxTotal(matrix, i - 1, j, n);
		return matrix[i][j] + Math.max(getMaxTotal(matrix, i - 1, j, n), getMaxTotal(matrix, i, j - 1, n));
	}
}