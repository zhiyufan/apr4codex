package com.codex;

import java.util.*;

public class Solution {
public static int findMinimumSteps(int[][] grid, int x) {
         int numberOfSteps = 0;
         for (int i = 0; i < grid.length; i++) {
             for (int j = 0; j < grid[0].length; j++) {
                 if (grid[i][j] < x) {
                     numberOfSteps += x - grid[i][j];
                 } else if (grid[i][j] > x) {
                     while (grid[i][j] != x) {
                         numberOfSteps++;
                         grid[i][j] -= x;
                     }
                 }
             }
         }
         return numberOfSteps;
     }
}