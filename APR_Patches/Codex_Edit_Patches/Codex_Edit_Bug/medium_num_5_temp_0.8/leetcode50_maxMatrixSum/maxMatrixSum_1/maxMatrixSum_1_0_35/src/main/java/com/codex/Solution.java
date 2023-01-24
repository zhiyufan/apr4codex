package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        long sum = 0;
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < aMatrix.length; j++) {
                sum += aMatrix[j];
            }
        }

        Map<Integer, List<Integer>> rowsForSwap = new HashMap<>();
        Map<Integer, List<Integer>> colsForSwap = new HashMap<>();
        for (int i = 0; i < matrix.length; i++)
        {
            List<Integer> row = new ArrayList<>();
            List<Integer> col = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1)
                {
                    row.add(j);
                }
                if (matrix[j][i] == -1)
                {
                    col.add(j);
                }
            }
            rowsForSwap.put(i, row);
            colsForSwap.put(i, col);
        }

        for (int i = 0; i < rowsForSwap.size(); i++)
        {
            if (rowsForSwap.get(i).size() % 2 != 0)
            {
                rowsForSwap.get(i).add(0, 0);
            }
            if (colsForSwap.get(i).size() % 2 != 0) {
                colsForSwap.get(i).add(0);
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