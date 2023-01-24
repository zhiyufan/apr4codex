package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x)
                    continue;
                else {
                    if (grid[i][j] < x) {
                        if ((x - grid[i][j]) % x != 0)
                            return -1;
                        numberOfOperations += (x - grid[i][j]) / x;
                    } else {
                        if ((grid[i][j] - x) % x != 0)
                            return -1;
                        numberOfOperations += (grid[i][j] - x) / x;
            }
            boolean
                    check =
                    false;
            while (grid.length > 1) {
                for (int k = 0; k < grid.length; k++) {
                    if (grid[grid.length - 1][k] == x) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    int[] temp = new int[grid[0].length];
                    int
                            index =
                            0;
                    for (int k = 0; k < grid[0].length; k++) {
                        if (grid[grid.length - 1][k] == x) temp[index] = x;
                        else temp[index] = x + (grid[grid.length - 1][k] - x) / 2;
                        index++;
                    }
                    numberOfOperations++;
                    int[][]
                            newGrid =
                            new int[grid.length][grid[0].length];
                    index =
                            0;
                    for (int k = 0; k < grid.length - 1; k++) {
                        newGrid[k] = grid[k];
                        index++;
                    }
                    newGrid[index] = temp;
                    grid = newGrid;
                }
                for (int k = 0; k < grid.length; k++) {
                    for (int l = 0; l < grid[0].length; l++) {
                        if (Math.abs(grid[k][l] - x) > 1) {
                            check = false;
                            break;
                        }
                    }
                    if (!check) break;
                }
                if (check) break;
                    }
                }
            }
        }
        return numberOfOperations;
    }

    
}