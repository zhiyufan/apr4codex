package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] first = grid[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < first.length; i++) {
            int temp = first[i];
            first[i] = Integer.MAX_VALUE;
            Arrays.sort(first);
            if (max < first[0])
                max = first[0];
            first[i] = temp;
        }
        return max;
    }

    
}