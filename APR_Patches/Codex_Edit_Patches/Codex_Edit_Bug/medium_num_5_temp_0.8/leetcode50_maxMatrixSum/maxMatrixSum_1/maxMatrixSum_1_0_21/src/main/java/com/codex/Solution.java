package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        if (matrix.length == 0) return 0;

        boolean[] rowsForSwap = new boolean[matrix.length];
        boolean[] colsForSwap = new boolean[matrix[0].length];
        List<Integer> rows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    rowsForSwap[i] = true;
                    break;
                }
                if (matrix[i][j] == 1) {
                    rows.add(i);
                }
            }
        }

        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][rows.get(i)] == -1) {
                    colsForSwap[j] = true;
                    break;
                }
            }
            
        }

        List<Integer> colsToSwap = new ArrayList<>();
        for (int i = 0; i < colsForSwap.size(); i++) {
            if (colsForSwap.get(i).size() > 0) {
                colsToSwap.addAll(colsForSwap.get(i));
            }
        }

        List<Integer> rowsToSwap = new ArrayList<>();
        for (int i = 0; i < rowsForSwap.size(); i++) {
            if (rowsForSwap.get(i).size() > 0) {
                rowsToSwap.addAll(rowsForSwap.get(i));
            }
        }

        for (int rowToSwap : rowsToSwap) {
            sum += -2 * matrix[rowToSwap][0];
        }
        for (int colToSwap : colsToSwap) {
            sum += -2 * matrix[0][colToSwap];
        }

        return sum;
    }

    
}