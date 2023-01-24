package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int gridGame(int[][] grid, int k, String rule) {
        
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp1 = new int[rows][cols];
        int[][] dp2 = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                dp1[i][j] = grid[i][j];
        }
        while(k > 0){
            k--;
            int[][] temp = new int[rows][cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                   int count = 0;
                   for(int[] dir : dirs){
                       int prevRow = i+dir[0];
                       int prevCol = j+dir[1];
                       if(prevRow < 0 || prevRow >= rows || prevCol < 0 || prevCol >= cols)
                           continue;
                       count += dp1[prevRow][prevCol];
                   }
                    if(rule.charAt(count) == 'D')
                        temp[i][j] = 1;
                   else
                       temp[i][j] = 0;
                }
            }
        }
        return sum;
    }

    
}