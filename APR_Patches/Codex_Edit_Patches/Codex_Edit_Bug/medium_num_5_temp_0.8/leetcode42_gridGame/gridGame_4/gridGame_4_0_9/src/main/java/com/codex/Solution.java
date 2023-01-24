package com.codex;

import java.util.*;

public class Solution {
    public static int gridGame(int[][] grid) {
        int[] first = new int[grid.length];
        for (int i = 0; i < grid[0].length; i++)
            first[i] = grid[0][i];
        Arrays.sort(first);
        int cnt = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != grid[i][cnt])
                break;
        }
        return sum;
    }

    
}