package com.codex;

import java.util.*;

public class Solution {
// Solution in Java
    public static long gridGame(int[][] grid) {

        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            first[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++)
            second[i] = grid[1][i];

        int[] order = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            order[i] = i;

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = i + 1; j < grid[0].length; j++) {
                if (first[i] < first[j]) {
                    int temp = first[i];
                    first[i] = first[j];
                    first[j] = temp;
                    temp = order[i];
                    order[i] = order[j];
                    order[j] = temp;
                }
                if (second[i] < second[j]) {
                    int temp = second[i];
                    second[i] = second[j];
                    second[j] = temp;
                    temp = order[i];
                    order[i] = order[j];
                    order[j] = temp;
                }
            }
        }

        int sum = 0;
        boolean swap = true;
        int i = 0;
        while (order[i] < grid[0].length) {
            if (swap) {
                sum += grid[1][order[i]];
                swap = false;
            } else {
                sum += grid[0][order[i]];
                swap = true;
            }
            ++i;
        }
        return sum;
    }

    
}