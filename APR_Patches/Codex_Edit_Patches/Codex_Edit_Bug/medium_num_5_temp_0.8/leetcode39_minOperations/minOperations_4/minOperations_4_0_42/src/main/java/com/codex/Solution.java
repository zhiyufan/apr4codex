package com.codex;

import java.util.*;

public class Solution {
	public static int minOperations(int[][] grid, int x) {


        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) {
                    continue;
                } else if (grid[i][j] < x) {
                    if ((x - grid[i][j]) % 2 == 0) {
                        numberOfOperations += (x - grid[i][j]) / 2;
                    } else {
                        return -1;
                    }
                } else if (grid[i][j] > x) {
                    if ((grid[i][j] - x) % 2 == 0) {
                        numberOfOperations += (grid[i][j] - x) / 2;
                    } else {
                        return -1;
                    }
                }
            }
        }
        return numberOfOperations;
    }

    
}