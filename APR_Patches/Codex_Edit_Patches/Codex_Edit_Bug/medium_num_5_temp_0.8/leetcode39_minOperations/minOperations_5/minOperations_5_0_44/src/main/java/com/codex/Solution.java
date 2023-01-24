package com.codex;

import java.util.*;

public class Solution {
Question:
    A 2D grid map of m rows and n columns is initially filled with water. 
    We may perform an addLand operation which turns the water at position (row, col) into a land. 
    Given a list of positions to operate, count the number of islands after each addLand operation. 
    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
    You may assume all four edges of the grid are all surrounded by water.

Example:
    Input: m = 3, n = 3, positions = [[0,0], [0,1], [1,2], [2,1]]
    Output: [1,1,2,3]
-------------------------------------------------------------------------------------------------------------------------------




    public static int minOperations(int[][] grid, int x) {
        
        boolean flag = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[0][0] != grid[i][j]) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            return 0;
        }
        int count = 0;
        if (grid[0][0] > x) {
            count += grid[0][0] - x;
            grid[0][0] = x;
        } else if (grid[0][0] < x) {
            count += (x - grid[0][0]) / x + ((x - grid[0][0]) % x == 0 ? 0 : 1);
            grid[0][0] = x;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != grid[0][0]) {
                    return -1;
                }
            }
        }
        return count;
    }

    
}