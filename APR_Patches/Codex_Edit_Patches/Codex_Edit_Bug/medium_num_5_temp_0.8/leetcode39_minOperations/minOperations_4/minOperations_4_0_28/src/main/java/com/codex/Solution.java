package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        //row

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    continue;

                if (grid[i][j] <= x)
                    numberOfOperations += (x - grid[i][j]) / x;
                else {
                    if ((grid[i][j] - x) % x == 0)
                        numberOfOperations += (grid[i][j] - x) / x;
                    else
            }

            if (grid[0][j] == x)
                numberOfOperations += 1;
        }

        //column
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    continue;

                if (grid[i][j] <= x)
                    numberOfOperations += (x - grid[i][j]) / x;
                else {
                    if ((grid[i][j] - x) % x == 0)
                        numberOfOperations += (grid[i][j] - x) / x;
                    else
                        return -1;
                }
            }

            if (grid[i][0] == x)
                numberOfOperations += 1;
        }

        //1st row and column
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] == x)
                numberOfOperations += 1;
        }

        for (int i = 1; i < grid.length; i++) {
            if (grid[i][0] == x) {
                numberOfOperations += 1;
                        return -1;
                }
            }
        }
        return numberOfOperations;
    }


    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        minOperations(ar, 1);
    }
}