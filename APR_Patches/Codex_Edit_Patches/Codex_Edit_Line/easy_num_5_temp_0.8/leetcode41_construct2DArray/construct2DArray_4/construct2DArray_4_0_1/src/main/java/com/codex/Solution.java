package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] arr = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (k < original.length) {
                    arr[i][j] = original[k];
                    k += 1;
                }
            }
        }
        return arr;
    }

    
    import java.util.Arrays;
    public class ArrayCompare {
      public static void main(String[] args) {
        int [] array1 = {2,5,1,6,3,1,4};
        int [] array2 = {2,5,1,6,3,1,4};
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array1, array2));
      }
    }
    
}