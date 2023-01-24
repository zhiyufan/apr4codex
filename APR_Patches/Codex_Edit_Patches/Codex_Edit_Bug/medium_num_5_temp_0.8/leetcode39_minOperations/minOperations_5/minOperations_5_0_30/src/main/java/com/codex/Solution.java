package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
        
        int count = 0, i = 0, j = 0, newI = 0, newJ = 0, len1 = grid.length, len2 = grid[0].length;
    
    while (i < len1 && j < len2) {
    
        count += grid[i][j];
        newI = i;
        newJ = j;
        if (i + 1 < len1 && j + 1 < len2) {

            int next = grid[i + 1][j + 1];
            int down = grid[i + 1][j];
            int right = grid[i][j + 1];

            if (Math.max(Math.max(down, right), next) == next) {
                newI = i + 1;
                newJ = j + 1;
            } else if (Math.max(Math.max(down, right), next) == down) {
                newI = i + 1;
                newJ = j;
            } else {
                newI = i;
                newJ = j + 1;
            }
        } else if (i + 1 < len1) {
            newI = i + 1;
        } else if (j + 1 < len2) {
            newJ = j + 1;
        } 

        count += getCost(grid[newI][newJ], x);
        if (count < 0) {
            return -1;
        }

        i = newI;
        j = newJ;
    }
    return count;
}

public static int getCost(int current, int x) {
    int cost = 0;
    if (current > x) {
        cost += current - x;
    } else if (x > current) {
        int div = x - current;
        cost += div / 2;
        if (div % 2 == 1) {
            cost++;
        }
    }
    return cost;
}
    
}