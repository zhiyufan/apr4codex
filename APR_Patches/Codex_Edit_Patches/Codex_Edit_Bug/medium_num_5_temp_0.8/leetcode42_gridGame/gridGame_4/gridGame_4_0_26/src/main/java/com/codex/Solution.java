package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            first[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++)
            second[i] = grid[1][i];
        Arrays.sort(first);
        Arrays.sort(second);
        int sum = 0;
        boolean swap = true;
        for (int i = 0; i < grid[0].length; i++) {
            if (swap) {
                sum += second[grid[0].length - i - 1];
                swap = false;
            } else {
                sum += first[grid[0].length - i - 1];
                swap = true;
            }
        }
        return sum;
    }

	
	public static int editDistance(String s1, String s2) {
        int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length() + 1; i++) {
            matrix[i][0] = i;
        }
        for (int i = 0; i < s2.length() + 1; i++) {
            matrix[0][i] = i;
        }
        for (int i = 1; i < s1.length() + 1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {
                int small = Math.min(matrix[i - 1][j] + 1, matrix[i][j - 1] + 1);
                int diff = (s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1);
                matrix[i][j] = Math.min(small, matrix[i - 1][j - 1] + diff);
            }
        }
        return matrix[s1.length()][s2.length()];
    }
}