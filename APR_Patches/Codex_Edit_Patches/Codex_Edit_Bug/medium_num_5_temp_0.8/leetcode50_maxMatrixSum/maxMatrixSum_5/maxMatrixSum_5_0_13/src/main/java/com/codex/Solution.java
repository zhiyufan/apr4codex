package com.codex;

import java.util.*;

public class Solution {
public class Gu {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(maxMatrixSum(arr1));

		int[][] ar2 = { { -1, -2, -3, -4, -5 }, { -1, -2, -3, -4, -5 }, { -1, -2, -3, -4, -5 } };
		System.out.println(maxMatrixSum(ar2));

		int[][] arr3 = { { -1, -2, -3, -4, -5 }, { -1, -2, -3, -4, -5 }, { -1, -2, -3, -4, -5 } };
		System.out.println(maxMatrixSum(arr3));

		int[][] arr4 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(maxMatrixSum(arr4));

		int[][] arr5 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(maxMatrixSum(arr5));

		int[][] arr6 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(maxMatrixSum(arr6));

		int[][] arr7 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(maxMatrixSum(arr7));

		int[][] arr8 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(maxMatrixSum(arr8));
	}

	public static long maxMatrixSum(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] matrixSum = new int[rows][cols];

        matrixSum[0][0] = matrix[0][0];

        for (int i = 1; i < rows; i++) {
			matrixSum[i][0] = matrixSum[i - 1][0] + matrix[i][0];
		}

		for (int j = 1; j < cols; j++) {
			matrixSum[0][j] = matrixSum[0][j - 1] + matrix[0][j];
		}

        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                matrixSum[i][j] = matrix[i][j] + Math.max(matrixSum[i-1][j],matrixSum[i][j-1]);
            }
        }

        long maxSum = Long.MIN_VALUE;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(maxSum<matrixSum[i][j]) {
                    maxSum = matrixSum[i][j];
                }
            }
        }

        return maxSum;
    }
}