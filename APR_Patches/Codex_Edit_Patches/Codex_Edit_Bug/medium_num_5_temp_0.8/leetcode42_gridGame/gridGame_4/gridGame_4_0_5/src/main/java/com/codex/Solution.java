package com.codex;

import java.util.*;

public class Solution {
package gfg;

import java.util.Arrays;

public class GridGame{
    public static long gridGame(int[][] grid) {

        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            first[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++)
            second[i] = grid[1][i];
        Arrays.sort(first);
        Arrays.sort(second);
        int sum = 0;
        boolean swap = true;
        for (int i = 0; i < grid[0].length; i++) {
            if (swap) {
                sum += second[grid[0].length - i - 1];
                swap = false;
            } else {
                sum += first[grid[0].length - i - 1];
                swap = true;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {5, 7, 1, 6},
                {2, 3, 8, 9}
        };
        System.out.println(gridGame(grid));
    }
}
}