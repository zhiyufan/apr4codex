package com.codex;

import java.util.*;

public class Solution {
public static int[] executeInstructions(int n, int[] startPos, String s) {

        int[] ans = new int[s.length() + 1];
        ans[0] = 1;

        for (int i = 1; i < s.length() + 1; i++) {
            char[] dir = s.substring(0, i).toCharArray();

            int[] pos = Arrays.copyOf(startPos, 2);

            boolean canMove = canMove(n, pos, dir);

            if (canMove) {
                ans[i] = i;
            } else {
                ans[i - 1] = i - 1;
            }
        }

        return ans;
    }

    public static boolean canMove(int n, int[] pos, char[] dir) {

        for (int j = 0; j < dir.length; j++) {
                int row = pos[0];
                int col = pos[1];
                if (dir[j] == 'L') {
                    if (col == 0 || grid[row][col - 1] == 1) {
                        return false;
                    } else {
                        pos[1]--;
                        grid[row][col - 1] = 1;
                    }
                } else if (dir[j] == 'R') {
                    if (col == n - 1 || grid[row][col + 1] == 1) {
                        return false;
                    } else {
                        pos[1]++;
                        grid[row][col + 1] = 1;
                    }
                } else if (dir[j] == 'U') {
                    if (row == 0 || grid[row - 1][col] == 1) {
                        return false;
                    } else {
                        pos[0]--;
                        grid[row - 1][col] = 1;
                    }

                } else if (dir[j] == 'D') {
                    if (row == n - 1 || grid[row + 1][col] == 1) {
                        return false;
                    } else {
                        pos[0]++;
                        grid[row + 1][col] = 1;
                    }
                }
            }

        return true;
        }
}