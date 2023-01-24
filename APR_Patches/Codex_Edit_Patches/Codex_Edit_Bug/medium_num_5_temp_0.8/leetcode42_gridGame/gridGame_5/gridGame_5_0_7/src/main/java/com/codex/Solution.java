package com.codex;

import java.util.*;

public class Solution {

    public static int gridGame(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;        
        int sum = 0;
        for (int i = 0; i < m; i++) {
			int tmp = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				if (grid[j][i] < tmp) {
					tmp = grid[j][i];
				}
			}
			sum += tmp;
        }
        return sum;
    }

    
}