package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        //int[][] result = new int[m][n];
        int[] result = new int[m*n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (index < original.length) {
                    result[index] = original[index];
                }
                index++;
            }
        }
        //return result;
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return result;
    }

    
}