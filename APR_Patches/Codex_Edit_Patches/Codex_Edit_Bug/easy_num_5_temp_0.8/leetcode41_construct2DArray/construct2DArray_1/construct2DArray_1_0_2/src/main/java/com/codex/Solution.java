package com.codex;

import java.util.*;

public class Solution {
	public static int[][] construct2DArray(int[] original, int nRow, int nCol) {
		int[][] result = new int[nRow][nCol];
		if (original.length != nRow * nCol) return result;
		int count = 0;
		for (int i = 0; i < nRow; i++) {
			for (int j = 0; j < nCol; j++) {
				result[i][j] = original[count];
				count++;
			}
		}
		return result;
	}
}