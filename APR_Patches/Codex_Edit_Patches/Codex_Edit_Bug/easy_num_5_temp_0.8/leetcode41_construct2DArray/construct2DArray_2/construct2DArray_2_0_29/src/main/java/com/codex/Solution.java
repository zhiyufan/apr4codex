package com.codex;

import java.util.*;

public class Solution {
public static int[][] construct2DArray(int[] original, int m, int n) {
		
		int[][] result = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// bug fix:
				// should be
				// if (i * n + j < original.length)
				// instead of
				// if (i * n + j <= original.length)
				if (i * n + j < original.length) {
					result[i][j] = original[i * n + j];
				}
			}
		}
		return result;
	}
        
}