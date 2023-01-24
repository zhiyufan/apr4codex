package com.codex;

import java.util.*;

public class Solution {
package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1,2},
            {3,4}
        };
        
        System.out.println(maxValue(matrix));
    }


    public static int maxValue(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;


        int[][] sums = new int[rows][columns];

        sums[0][0] = matrix[0][0];

        for (int i = 1; i < rows; i++) {
            sums[i][0] = Math.max(sums[i - 1][0] + matrix[i][0], matrix[i][0]);
        }

        for (int j = 1; j < columns; j++) {
            sums[0][j] = Math.max(sums[0][j - 1] + matrix[0][j], matrix[0][j]);
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                sums[i][j] = Math.max(sums[i - 1][j] + matrix[i][j], sums[i][j - 1] + matrix[i][j]);
            }
        }

        return sums[rows - 1][columns - 1];
    }

}
}