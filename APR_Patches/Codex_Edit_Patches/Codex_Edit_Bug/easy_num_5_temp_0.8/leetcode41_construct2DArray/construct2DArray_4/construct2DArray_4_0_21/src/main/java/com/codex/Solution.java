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



    public static List<Integer> listOfCommonElements(int[] firstArray, int[] secondArray) {
        List<Integer> commonList = new ArrayList<Integer>();
        for (int i = 0; i < firstArray.length; i++) {
            if (isPresentInArray(secondArray, firstArray[i])) {
                commonList.add(firstArray[i]);
            }
        }
        return commonList;
    }

    
    
}