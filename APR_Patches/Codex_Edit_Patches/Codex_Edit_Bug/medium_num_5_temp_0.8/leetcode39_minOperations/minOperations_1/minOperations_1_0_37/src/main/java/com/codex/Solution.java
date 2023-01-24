package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{3, 4, 0, 2}, {1, 1, 1, 1}, {1, 0, 1, 1}, {2, 3, 1, 5}};
        int result = minOperations(grid, 5);
        System.out.println(result);
    }

    public static int minOperations(int[][] grid, int x) {

        int[] target = new int[grid[0].length];
        // System.out.println(Arrays.toString(target));
        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[0].length; k++) {
                System.out.println(Arrays.toString(target));
                int t = target[k];
                while (target[k] > grid[i][k]) {
                    target[k] -= x;
                }
                if (t <= grid[i][k]) {
                    System.out.println("t > grid[i][k] " + t + " " + grid[i][k]);
                    target[k] = grid[i][k];
                }
                System.out.println(Arrays.toString(target));
            }
        }
        int result = 0;
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                while (grid[i][j] < target[j]) {
                    grid[i][j] += x;
                    result++;
                }
            }
        }
        if (max - min < x) {
            return -1;
        }
        int target = max - (max - min) % x;
        int result = (max - target) / x;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < target) {
                    result += (target - grid[i][j]) / x;
                }
            }
        }
        return result;
    }

    
}