package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int m = 3;
        int n = 3;
        int[][] result = new Main().construct2DArray(original, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
        
    }

    public int[][] construct2DArray(int[] original, int m, int n) {

        int[][] result = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (k < original.length) {
                    result[i][j] = original[k];
                    k += 1;
                }
            }
        }
        return result;
    }

}
}