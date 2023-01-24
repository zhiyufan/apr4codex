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
    }public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for(int matrix_i = 0; matrix_i < n; matrix_i++){
            for(int matrix_j = 0; matrix_j < m; matrix_j++){
                matrix[matrix_i][matrix_j] = in.nextInt();
            }
        }
        long result = maxMatrixSum(matrix);
        System.out.println(result);
        in.close();
    }
        for (int colToSwap : colsToSwap) {
            sum += -2 * matrix[0][colToSwap];
        }

        return sum;
    }

    
}