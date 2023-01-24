package com.codex;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
			int[][] a = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 1, 1, 1, 1 }, { 2, 2, 2, 2 } };
			System.out.println(gridGame(a, 0, 0));
		}
		
		public static int gridGame(int[][] grid, int i, int j) {
			if (i >= grid.length || j >= grid[0].length) {
				return 0;
			}
			if (grid[i][j] == 0) {
				return Integer.MIN_VALUE;
			}
			return grid[i][j] + Math.max(gridGame(grid, i + 1, j), gridGame(grid, i, j + 1));
            }
}