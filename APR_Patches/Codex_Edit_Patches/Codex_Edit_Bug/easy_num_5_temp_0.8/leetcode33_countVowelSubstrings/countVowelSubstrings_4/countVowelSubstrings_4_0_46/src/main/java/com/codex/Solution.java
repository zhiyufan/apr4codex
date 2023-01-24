package com.codex;

import java.util.*;

public class Solution {
public class Testing {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] % 2 == 0) {
                    System.out.println();
                }
            }
        }
    }

}
}