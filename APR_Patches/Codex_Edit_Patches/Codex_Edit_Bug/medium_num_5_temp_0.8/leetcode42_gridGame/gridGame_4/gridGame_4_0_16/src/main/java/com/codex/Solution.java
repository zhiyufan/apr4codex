package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        int[][] newGrid = new int[grid.length][];
        for (int i = 0; i < grid[0].length; i++) {
            first[i] = grid[0][i];second[i] = grid[1][i];
        }
        Arrays.sort(first);
        Arrays.sort(second);
        newGrid[0] = first;
        newGrid[1] = second;
        int sum = 0;
        boolean swap = true;
        for (int i = 2; i < grid.length; i++) {
            int[] cur = newGrid[i-1];
            int[] next = new int[grid[0].length];
            for(int j = 0; j < next.length; j++) 
                next[j] = grid[i][j];
            Arrays.sort(next);
            if (swap) {
                for(int j = 0; j < next.length; j++) 
                    next[j] = cur[cur.length - j - 1];
                swap = false;
            } else {
                swap = true;
            }
            newGrid[i] = next;
        }
        for(int j = 0; j < grid[0].length; j++) 
            sum += newGrid[newGrid.length - 1][j];
        return sum;
    }

    public static long gridGame2(int[][] grid) {
        
        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            first[i] = grid[0][i];second[i] = grid[1][i];
        }
        Arrays.sort(first);
        Arrays.sort(second);
        int sum = 0;
        boolean swap = true;
        for (int i = 2; i < grid.length; i++) {
            int[] cur = new int[grid[i].length];
            for (int j = 0; j < grid[i].length; j++)
                cur[j] = grid[i][j];
            Arrays.sort(cur);
            if (swap) {
                for (int j = 0; j < grid[i].length; j++)
                    sum += cur[grid[i].length - j - 1];
                swap = false;
            } else {
                for (int j = 0; j < grid[i].length; j++)
                    sum += cur[grid[i].length - j - 1];
                swap = true;
            }
        }
        return sum;
    }

    public static long gridGame1(int[][] grid) {
        
        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            first[i] = grid[0][i];second[i] = grid[1][i];
        }
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

    
}