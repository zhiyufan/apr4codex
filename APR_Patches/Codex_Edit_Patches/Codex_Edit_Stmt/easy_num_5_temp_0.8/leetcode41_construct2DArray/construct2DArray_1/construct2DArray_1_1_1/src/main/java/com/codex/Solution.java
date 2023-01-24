package com.codex;

import java.util.*;

public class Solution {
public class Solution {
	public int[][] construct2DArray(int[] original, int m, int n) {
		// Write your solution here.
		//corner case
		if (original == null || original.length == 0 || original.length != m * n){
			return new int[m][n];
		}
        
		int[][] result = new int[m][n];
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = original[count];
				count++;
			}
		}
		return result;
	}
}
}