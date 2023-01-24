package com.codex;

import java.util.*;

public class Solution {
package Main.Pages;

import java.util.Arrays;

public class ConstructArray {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9};
        int m=3;
        int n=3;
        System.out.println(Arrays.toString(construct2DArray(a,m,n)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n]; // result[3][3]
        if (original.length != m * n) return result; //이 if문은 0으로 초기화된 배열이 출력됨
        int count = 0; // count 0
        for (int i = 0; i < m; i++) { // 0 1 2
            for (int j = 0; j < n; j++) { // 0 1 2
                result[i][j] = original[count]; // result0= original count ++
                count++; //1 2 3
            }
        }
        return result;
    }

    
}