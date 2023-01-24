package com.codex;

import java.util.*;

public class Solution {
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

    public class Solution {

    /**
     * @param matrix an integer array of n * m matrix
     * @param k an integer
     * @return the maximum number
     */
    public int maxSlidingMatrix(int[][] matrix, int k) {
        // Write your code here
        // write your code here
        int[][] maxleft = new int[matrix.length][matrix[0].length];
        int[][] maxright = new int[matrix.length][matrix[0].length];
        int[][] maxup = new int[matrix.length][matrix[0].length];
        int[][] maxdown = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) {
                    maxup[i][j] = matrix[i][j];
                } else {
                    maxup[i][j] = Math.max(maxup[i-1][j], matrix[i][j]);
                }
                if (j == 0) {
                    maxleft[i][j] = matrix[i][j];
                } else {
                    maxleft[i][j] = Math.max(maxleft[i][j-1], matrix[i][j]);
                }
            }
        }

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (i == matrix.length - 1) {
                    maxdown[i][j] = matrix[i][j];
                } else {
                    maxdown[i][j] = Math.max(maxdown[i+1][j], matrix[i][j]);
                }
                if (j == matrix[0].length - 1) {
                    maxright[i][j] = matrix[i][j];
                } else {
                    maxright[i][j] = Math.max(maxright[i][j+1], matrix[i][j]);
                }
            }
        }

        int rst = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int left = j - k >= 0 ? maxleft[i][j - k] : Integer.MIN_VALUE;
                int right = j + k < matrix[0].length ? maxright[i][j + k] : Integer.MIN_VALUE;
                int up = i - k >= 0 ? maxup[i - k][j] : Integer.MIN_VALUE;
                int down = i + k < matrix.length ? maxdown[i + k][j] : Integer.MIN_VALUE;
                rst = Math.max(rst, Math.max(Math.max(left, right), Math.max(up, down)));
            }
        }
        return rst;
    }
}