package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] matrixSum = new int[rows][cols];

        matrixSum[0][0] = matrix[0][0];

        for(int i=1;i<rows;i++) {
            matrixSum[i][0] = matrixSum[i-1][0] + matrix[i][0];
        }

        for(int j=1;j<cols;j++) {
            matrixSum[0][j] = matrixSum[0][j-1] + matrix[0][j];
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

    public static List<Integer> maxSubArray(int[] array) {
        int size = array.length;
        int[] dp = new int[size];
        dp[0] = array[0];
        int max = array[0];
        int maxIndex = 0;

        for(int i=1;i<size;i++) {
            dp[i] = Math.max(array[i],dp[i-1]+array[i]);
            if(dp[i]>max) {
                max = dp[i];
                maxIndex = i;
            }
        }

        List<Integer> list = new ArrayList<>();

        if(max<0) {
            list.add(array[maxIndex]);
            return list;
        }

        int sum = 0;
        for(int i=maxIndex;i>=0;i--) {
            if(sum<max) {
                sum+=array[i];
                list.add(array[i]);
            }
            else {
                break;
            }
        }

        return list;
    }
}