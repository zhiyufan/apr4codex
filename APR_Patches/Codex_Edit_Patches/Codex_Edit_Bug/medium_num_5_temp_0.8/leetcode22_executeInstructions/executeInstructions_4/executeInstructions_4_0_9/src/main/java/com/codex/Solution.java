package com.codex;

import java.util.*;

public class Solution {
public class GFG {

    private static int mod = 1000000007;

    public static int countPaths(int n, int[] startPos) {
        int[][] grid = new int[n][n]; // Grid to keep track of the visited cells
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            ans = (ans + dfs(i, startPos, grid)) % mod;
        }
        return ans;
    }

    private static int dfs(int k, int[] startPos, int[][] grid) {
        int row = startPos[0];
        int col = startPos[1];
        int n = grid.length;
        if (row < 0 || row >= n || col < 0 || col >= n || grid[row][col] == 1) {
            return 0;
        } else if (k == 0) {
            return 1;
        } else {
            int left = dfs(k - 1, new int[] { row, col - 1 }, grid);
            int right = dfs(k - 1, new int[] { row, col + 1 }, grid);
            int up = dfs(k - 1, new int[] { row - 1, col }, grid);
            int down = dfs(k - 1, new int[] { row + 1, col }, grid);
            grid[row][col] = 1; // mark current cell as visited
            int ans = (left + right + up + down) % mod;
            grid[row][col] = 0; // unmark the current cell once we are done with it
            return ans;
        }
    }


    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char[] dir = new char[i + 1]; // Dir of length 1 to i
            for (int j = 0; j < dir.length; j++) { // populate the dir array
                dir[j] = s.charAt(j); // populating the dir array
            }
            int[] pos = Arrays.copyOf(startPos, startPos.length);
            boolean canMove = true; // set to false if the path is struck
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
                } else {
                    break;
                }
            }
            if (canMove) {
                ans += dir.length;
                if (ans > 1000000007) { // Mod the answer
                    ans = ans % 1000000007;
                }
            }
        }
        return ans; // return the ans
    }


    public static void main(String[] args) {
        int[] startPos = { 3, 0 };
        String s = "LLLLLLLLRLDRRLD";
        System.out.println(executeInstructions(4, startPos, s));
        System.out.println(countPaths(4, startPos));
    }
}
}