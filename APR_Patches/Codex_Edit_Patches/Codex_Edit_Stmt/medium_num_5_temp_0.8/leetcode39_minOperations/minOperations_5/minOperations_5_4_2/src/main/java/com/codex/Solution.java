package com.codex;

import java.util.*;

public class Solution {
# java #

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

# python #

    def minOperations(self, grid, x):
        N, M = len(grid), len(grid[0])
        #l, r = 0, M - 1
        #u, d = 0, N - 1
        a, b = 0, 0
        while a < N:
            while grid[a][b] == x and b < M:
                b += 1
            if b < M:
                break
            a += 1
            b = 0
        if a == N:
            return 0

        if grid[a][b] > x:
            return -1
        
        ret = 0
        #print(a, b)
        while grid[a][b] < x:
            diff = x - grid[a][b]
            if diff % x != 0:
                return -1
            ret += diff // x
            grid[a][b] += diff
        return ret
    
}