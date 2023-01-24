package com.codex;

import java.util.*;

public class Solution {
        public static int minOperations(int[][] grid) {
        boolean flag = false;
        int x = grid[0][0];
        int count = 0;
        if (grid[0][0] > x) {
            count += grid[0][0] - x;
            grid[0][0] = x;
        }
        if (grid[0][0] < x) {
            count += (x - grid[0][0]) / x + ((x - grid[0][0]) % x == 0 ? 0 : 1);
            grid[0][0] = x;
        }
        if (check(grid, x)) {
            return count;
        }
        return -1;
    }

    /*
    检查是否能够一步操作完成
     */
    public static boolean check(int[][] grid, int x) {
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][0] % x != 0) {
                return false;
            }
        }
        for (int i = 1; i < grid[0].length; i++) {
            if (grid[0][i] % x != 0) {
                return false;
            }
        }
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][0] / x != grid[0][0]) {
                return false;
            }
        }
        for (int i = 1; i < grid[0].length; i++) {
            if (grid[0][i] / x != grid[0][0]) {
                return false;
            }
        }
        return true;
    }
    /*
    执行操作
     */
    public static void operation(int[][] grid, int x) {

    }

    
}