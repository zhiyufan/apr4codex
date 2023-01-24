package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        boolean isFirst = true;
        int r = grid.length, c = grid[0].length;
        int col = 0;
        while (col < c && grid[0][col] == 0)
            col++;
        int row = col == c ? 1 : 0;
        while (row < r && grid[row][0] == 0)
            row++;
        if (col == c || row == r)
            return -1;
        int curr = grid[row][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (curr != grid[i][j]){
                    if (isFirst) {
                        isFirst = false;
                        int diff = curr - grid[i][j];
                        if (diff < 0)
                            return -1;
                        curr = grid[i][j];
                        if (diff % x != 0)
                            return -1;
                    } else {
                        return -1;
                    }
                }
            }
        }
        return curr == x ? 0 : (x - curr) / x;
    }

    
}