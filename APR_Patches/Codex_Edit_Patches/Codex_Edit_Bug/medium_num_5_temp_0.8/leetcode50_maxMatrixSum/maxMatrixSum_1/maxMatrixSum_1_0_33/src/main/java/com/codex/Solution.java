package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        long sum = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[0][i];
        }

        List<List<Integer>> rowsForSwap = new ArrayList<>();
        for (int i = 1; i < matrix.length; i++) {
            int min1 = matrix[i][0];
            int min2 = matrix[i][1];
            int index1 = 0;
            int index2 = 1;
            for (int j = 2; j < matrix[0].length; j++) {
                if (min2 >= matrix[i][j]) {
                    min1 = min2;
                    index1 = index2;
                    min2 = matrix[i][j];
                    index2 = j;
                } else if (min1 >= matrix[i][j]) {
                    min1 = matrix[i][j];
                    index1 = j;
                } 
            }

            if (min1 + min2 > 0) {
                sum += min1 + min2;
                rowsForSwap.add(Arrays.asList(i, index1, index2));
            }
        }

        for (int i = 0; i < rowsForSwap.size(); i++) {
            if (rowsForSwap.get(i).size() % 2 != 0) {
                rowsForSwap.get(i).add(0);
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