package com.codex;

import java.util.*;

public class Solution {
public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[original.length/n][n];
        if(m<=0||n<=0){
            return new int[0][0];
        }
        if(original.length%n!=0){
            return new int[0][0];
        }
        for (int i=0; i<(original.length/n); i++) {
            for (int j=0; j<n; j++) {
                result[i][j]=original[n*i+j];
            }
        }
        return result;
    }
}