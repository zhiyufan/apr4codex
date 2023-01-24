package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
        }
        return count;
    }


    public static int[][] isSumIn(int[][] matrix, int target) {
        int[][] res = new int[2][2];
        int m = matrix.length, n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    res[0][0] = i;
                    res[0][1] = j;
                    return res;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < target) {
                    visited[i][j] = true;
                    for (int ii = 0; ii < m; ii++) {
                        for (int jj = 0; jj < n; jj++) {
                            if (!visited[ii][jj] && matrix[i][j] + matrix[ii][jj] == target) {
                                res[0][0] = i;
                                res[0][1] = j;
                                res[1][0] = ii;
                                res[1][1] = jj;
                                return res;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
    
}