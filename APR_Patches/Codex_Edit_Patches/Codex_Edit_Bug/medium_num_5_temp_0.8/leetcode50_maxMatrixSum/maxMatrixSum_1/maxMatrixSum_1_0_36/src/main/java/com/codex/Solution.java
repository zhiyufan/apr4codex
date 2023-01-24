package com.codex;

import java.util.*;

public class Solution {
    /*
    T: O(n^2)
    S: O(n)
    */
    public static long maxMatrixSum(int[][] matrix) {
        
        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }

        List<List<Integer>> rowsForSwap = new ArrayList<>();
        List<List<Integer>> colsForSwap = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> col = new ArrayList<>();
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == -1) {
                    row.add(j);
                }
                if (matrix[j][i] == -1) {
                    col.add(j);
                }
            }
            rowsForSwap.add(row);
            colsForSwap.add(col);
        }

            if (rowsForSwap.get(i).size() % 2 == 0) {
                sum += matrix[i][0] * 2;
            }
            if (colsForSwap.get(i).size() % 2 == 0) {
                sum += matrix[0][i] * 2;
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