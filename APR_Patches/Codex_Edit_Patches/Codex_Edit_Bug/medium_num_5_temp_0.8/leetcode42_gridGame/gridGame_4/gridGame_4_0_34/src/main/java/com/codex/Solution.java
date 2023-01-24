package com.codex;

import java.util.*;

public class Solution {
public static long gridGame(int[][] grid) {
        
        int[] first = new int[grid[0].length+2];
        int[] second = new int[grid[0].length+2];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (i == 0)
                    first[j+1] = grid[i][j];
                else
                    second[j+1] = grid[i][j];
            }
        }
        Arrays.sort(first);
        Arrays.sort(second);
        int sum = 0;
        boolean swap = true;
        for (int i = 1; i < second.length-1; i++) {
            if (swap) {
                sum += second[second.length - i - 1];
                swap = false;
            } else {
                sum += first[second.length - i - 1];
                swap = true;
            }
        }
        return sum;
    }

    
}