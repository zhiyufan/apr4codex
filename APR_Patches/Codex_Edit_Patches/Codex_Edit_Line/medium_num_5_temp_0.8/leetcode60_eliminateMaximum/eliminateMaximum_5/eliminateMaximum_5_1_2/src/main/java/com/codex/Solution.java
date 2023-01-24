package com.codex;

import java.util.*;

public class Solution {
    public int searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        int count = 0;
        while (row < m && col >= 0) {
            if (matrix[row][col] < target) {
                row++;
            }
            else if (matrix[row][col] > target) {
                col--;
            }
            else {
                count++;
                row++;
                col--;
            }
        }
        return count;
    }
    
}