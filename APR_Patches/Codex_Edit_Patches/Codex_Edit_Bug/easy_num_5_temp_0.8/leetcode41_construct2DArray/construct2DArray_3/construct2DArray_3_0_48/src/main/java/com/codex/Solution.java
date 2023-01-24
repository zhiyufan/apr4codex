package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        if (original.length < m * n) {
            return new int[0][0];
        }
        int[][] arr = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[index];
                index += 1;
            }
        }
        return arr;
    }

    /*
    Given an array of size n and an integer m calculate and return an array with the following elements:
    old array [0...n-m]
    m zeros
    old array [n-m...n]
    Input parameters:
    array - original array
    m - number of zeros
    Constraints:
    1 <= m <= n
    Examples:
    [2,0,3,0,4,0,5,10], m = 3 -> [2,0,3,0,4,10,5,0]
    [2,0,3,0,4,0,5,10], m = 4 -> [2,0,3,0,5,10,4,0]
    [2,0,3,0,4,0,5,10], m = 10 -> [10,0,4,0,2,0,3,0]
    */
    public static int[] zeroMax(int[] array, int m) {
        
        int[] result = new int[array.length];
        int[] temp = new int[array.length];
        int i = 0;
        for (int number : array) {
            if (number == 0) {
                temp[i] = i;
                i++;
            }
        }
        for (int k = 0; k < temp.length; k++) {
            if (temp[k] == 0) {
                temp[k] = -1;
            }
        }
        int max = -1;
        int tempIndex = 0;
        for (int j = 0; j < array.length; j++) {
            if (temp[j] != -1 && max < array[temp[j]]) {
                max = array[temp[j]];
                tempIndex = j;
            }
        }
        if (m < tempIndex) {
            result = array;
            result[m] = max;
            return result;
        } else {
            int temp_arr[] = new int[array.length];
            int k = 0;
            for (i = m; i < array.length; i++) {
                temp_arr[k] = array[i];
                k++;
            }
            int l = 0;
            for (i = 0; i < m; i++) {
                temp_arr[k] = array[l];
                k++;
                l++;
            }
            for (i = 0; i < temp_arr.length; i++) {
                if(temp_arr[i] == array[m]) {
                    result[i] = max;
                } else {
                    result[i] = temp_arr[i];
                }
            }
            return result;
        }
    }
}
}