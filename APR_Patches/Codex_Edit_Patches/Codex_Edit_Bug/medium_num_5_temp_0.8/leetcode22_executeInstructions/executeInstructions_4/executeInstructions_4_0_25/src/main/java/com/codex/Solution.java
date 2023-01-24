package com.codex;

import java.util.*;

public class Solution {
public static int[] executeInstructions(int n, int[] startPos, String s) {

    int[][] grid = new int[n][n];
    int[] ans = new int[s.length()];
    for (int i = 1; i <= s.length(); i++) {
        char[] dir = new char[i];
        for (int j = 0; j < dir.length; j++) {
            dir[j] = s.charAt(j);
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
            }
            if (canMove) {
                ans[i] = dir.length;
            }
        }
        return ans;
    }

    
}