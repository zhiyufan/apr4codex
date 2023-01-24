package com.codex;

import java.util.*;

public class Solution {

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int[][] matrix1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println(maxMatrixSum(matrix1));

    }

    public static long maxMatrixSum(int[][] matrix) {
        
        long max = 0;
        long[] rowSum = maxRowSum(matrix);
        long[] colSum = maxColSum(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                max = Math.max(max, rowSum[i] + colSum[j] + matrix[i][j] + matrix[i][j + 1]);
            }
        }
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                max = Math.max(max, rowSum[i] + colSum[j] + matrix[i][j] + matrix[i + 1][j]);
            }
        }

        return max;
    }

    public static long[] maxRowSum(int[][] matrix) {
        long[] rowSumMax = new long[matrix.length];
        long[] rowSum = new long[matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rowSum[j] += matrix[j][i];
            }
            for (int j = 1; j < matrix.length; j++) {
                rowSum[j] = Math.max(rowSum[j], rowSum[j - 1] + rowSum[j]);
            }
            for (int j = 0; j < matrix.length; j++) {
                rowSumMax[j] = Math.max(rowSumMax[j], rowSum[j]);
            }
        }
        return rowSumMax;
    }


    public static long[] maxColSum(int[][] matrix) {
        long[] colSumMax = new long[matrix[0].length];
        long[] colSum = new long[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                colSum[j] += matrix[i][j];
            }
            for (int j = 1; j < matrix[0].length; j++) {
                colSum[j] = Math.max(colSum[j], colSum[j - 1] + colSum[j]);
            }
            for (int j = 0; j < matrix[0].length; j++) {
                colSumMax[j] = Math.max(colSumMax[j], colSum[j]);
            }
        }
        return colSumMax;
    }
}