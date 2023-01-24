package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
		int numberOfOperations = 0;
		boolean isTheFirstRowContainZero = false;
		for (int i = 0; i < grid[0].length; i++) {
			if (grid[0][i] == 0) {
				isTheFirstRowContainZero = true;
				break;
			}
        }
        return numberOfOperations;
    }

    
}