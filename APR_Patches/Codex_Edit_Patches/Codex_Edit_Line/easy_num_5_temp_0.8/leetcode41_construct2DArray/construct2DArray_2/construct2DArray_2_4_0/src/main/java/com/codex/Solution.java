package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < original.length) {
                    result[i][j] = original[i * n + j];
                }
            }
        }
        return result;
    }

    public int[] construct1DArray(int[][] original) {
        
        int m = original.length;
        int n = original[0].length;
        int numbers = m * n;
        int[] result = new int[numbers];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[index++] = original[i][j];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[][] test = construct2DArray(array, 2, 3);
        
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
        
        int[] result = new Construct1dArrayFrom2dArray().construct1DArray(test);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }
}