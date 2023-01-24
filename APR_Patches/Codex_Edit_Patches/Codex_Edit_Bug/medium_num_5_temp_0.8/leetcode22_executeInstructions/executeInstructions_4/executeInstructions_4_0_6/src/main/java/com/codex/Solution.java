package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String str) {

        int[][] grid = new int[n][n]; //create a matrix
        int[] ans = new int[str.length()]; //initially assign zero to all ans elements
        for (int i = 0; i < str.length(); i++) {
            char[] dir = new char[i + 1];  //create a character array that is 1 + i elements 
            for (int j = 0; j < dir.length; j++) { //loop through the elements and assign the value from the string
                dir[j] = str.charAt(j);
            }
            int[] pos = Arrays.copyOf(startPos, startPos.length);
            boolean canMove = true;
            for (int j = 0; j < dir.length; j++) {
                int row = pos[0];
                int col = pos[1];
                if (dir[j] == 'L') {
                    if (col == 0 || grid[row][col - 1] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[1]--;
                        grid[row][col - 1] = 1;
                    }
                } else if (dir[j] == 'R') {
                    if (col == n - 1 || grid[row][col + 1] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[1]++;
                        grid[row][col + 1] = 1;
                    }
                } else if (dir[j] == 'U') {
                    if (row == 0 || grid[row - 1][col] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[0]--;
                        grid[row - 1][col] = 1;
                    }

                } else if (dir[j] == 'D') {
                    if (row == n - 1 || grid[row + 1][col] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[0]++;
                        grid[row + 1][col] = 1;
                    }
                }
            }
            if (canMove) {
                ans[i] = dir.length;
            }
        }
        return ans;
    }

    
}