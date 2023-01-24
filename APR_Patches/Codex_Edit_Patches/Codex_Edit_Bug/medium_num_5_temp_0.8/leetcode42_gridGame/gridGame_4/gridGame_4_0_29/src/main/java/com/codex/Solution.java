package com.codex;

import java.util.*;

public class Solution {
        static int gridGame(int[][] grid, List<String> rules) {
        for (String rule : rules) {
            if (rule.equals("D")) {
                for (int i = 0; i < grid[0].length; i++) {
                    int row = i;
                    int j = 0;
                    int temp = 0;
                    while (j < grid[0].length && grid[row][j] == 0) {
                        j++;
                    }
                    temp = j;
                    while (j < grid[0].length && grid[row][j] != 0) {
                        j++;
                    }
                    if (j < grid[0].length && grid[row][j] == 0) {
                        grid[row][j] = 1;
                    }
                    while (temp < grid[0].length && grid[row][temp] != 0) {
                        temp++;
                    }
                    if (temp < grid[0].length && grid[row][temp] == 0) {
                        grid[row][temp] = 0;
                    }
                }
            }
            if (rule.equals("I")) {
                for (int i = 0; i < grid[0].length; i++) {
                    int row = i;
                    int j = grid[0].length - 1;
                    int temp = 0;
                    while (j >= 0 && grid[row][j] == 1) {
                        j--;
                    }
                    temp = j;
                    while (j >= 0 && grid[row][j] != 1) {
                        j--;
                    }
                    if (j >= 0 && grid[row][j] == 1) {
                        grid[row][j] = 0;
                    }
                    while (temp >= 0 && grid[row][temp] != 1) {
                        temp--;
                    }
                    if (temp >= 0 && grid[row][temp] == 1) {
                        grid[row][temp] = 1;
                    }
                }
            }
            if (rule.equals("A")) {
                for (int i = 0; i < grid[0].length; i++) {
                    int row = i;
                    int j = 0;
                    int temp = 0;
                    while (j < grid[0].length && grid[row][j] == 0) {
                        j++;
                    }
                    temp = j;
                    while (j < grid[0].length && grid[row][j] != 0) {
                        j++;
                    }
                    if (j < grid[0].length && grid[row][j] == 0) {
                        grid[row][j] = 1;
                    }
                    while (temp < grid[0].length && grid[row][temp] != 0) {
                        temp++;
                    }
                    if (temp < grid[0].length && grid[row][temp] == 0) {
                        grid[row][temp] = 0;
                    }
                }
            }
            if (rule.equals("V")) {
                for (int i = 0; i < grid[0].length; i++) {
                    int row = i;
                    int j = grid[0].length - 1;
                    int temp = 0;
                    while (j >= 0 && grid[row][j] == 1) {
                        j--;
                    }
                    temp = j;
                    while (j >= 0 && grid[row][j] != 1) {
                        j--;
                    }
                    if (j >= 0 && grid[row][j] == 1) {
                        grid[row][j] = 0;
                    }
                    while (temp >= 0 && grid[row][temp] != 1) {
                        temp--;
                    }
                    if (temp >= 0 && grid[row][temp] == 1) {
                        grid[row][temp] = 1;
                    }
                }
            }
        }
        return sum(grid);
    }

    static int sum(int[][] grid) {
        
        int s = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    s++;
            }
        }

        return s;
    }

}