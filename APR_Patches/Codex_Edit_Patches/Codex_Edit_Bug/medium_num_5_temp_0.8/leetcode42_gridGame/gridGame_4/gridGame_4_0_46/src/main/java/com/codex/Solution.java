package com.codex;

import java.util.*;

public class Solution {
    public static int gridGame(int[][] grid) {
        int[] first = new int[grid.length];
        int[] second = new int[grid.length];
        for(int i = 0; i < grid.length; i++)
            if(grid[i][0] == 0)
                first[i] = 0;
            else
                first[i] = 1;
        for(int i = 0; i < grid.length; i++)
            if(grid[i][1] == 0)
                second[i] = 0;
            else
                second[i] = 1;

        int firstSum = 0;
        int secondSum = 0;
        int count = 0;
        for(int i = 0; i < grid.length; i++)
            if(i % 2 == 0){
                firstSum += first[i];
                secondSum += second[i];
            }
            else{
                firstSum += second[i];
                secondSum += first[i];
            }

        return (firstSum > secondSum) ? firstSum : secondSum;
    }

    
}