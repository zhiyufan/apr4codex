package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {

        int count = 0;
        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = grid[i][j];
                int rr = 0;
                while (num != 0) {
                    int rem = num % x;
                    num = num / x;
                    if (rem > 0) {
                        if (rem == rows[i] || rem == cols[j]) {
                            return -1;
                        }
                        rows[i] = rem;
                        cols[j] = rem;
                    }
                    rr++;
                }
                count += rr;
            }
        }
        boolean flag = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[0][0] != grid[i][j]) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag && grid.length == 1) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != x) {
                    return -1;
                }
            }
        }
        return count;
    }

    
}