package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int m = grid[0].length;
        int[] grid1 = new int[m];
        int[] grid2 = new int[m];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[0][i];
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(sum(arr1,arr2,arr1.length));
    }
    public static int sum(long[] arr1, long[] arr2, int n){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[i]) {
                sum += arr2[i];
            } else {
                sum += arr1[i];
            }
        }
        return sum;
    }
    
}