package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        

        int n = bank.length;
        int m = bank[0].length();
        int[] ones = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bank[i].charAt(j) == '1') {
                    ones[i]++;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ones[i] > 1) {
                res += ones[i] * (ones[i] - 1) / 2;
            }

            for (int j = i + 1; j < n; j++) {
                if (ones[j] == 0) {
                    res += ones[i];
                }
            }
        }

        return res;
    }

        int n = bank.length;
        int m = bank[0].length();
        
        boolean[][] beams = new boolean[n][m];
        boolean[][] visited = new boolean[n][m];
        int res = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bank[i].charAt(j) == '1' && !visited[i][j]) {
                    if (canBuildBeam(bank, beams, i, j)) {
                        res++;
                    }
                    mark(bank, beams, visited);
                }
            }
        }

        return res;
    }

    private static boolean canBuildBeam(String[] bank, boolean[][] beams, int x, int y) {
        int n = bank.length;
        int m = bank[0].length();
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        
        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            int i = top[0];
            int j = top[1];
            beams[i][j] = true;
            
            for (int[] dir: DIRS) {
                int x2 = i + dir[0];
                int y2 = j + dir[1];
                
                // outside of the board
                if (x2 < 0 || x2 == n || y2 < 0 || y2 == m) {
                    continue;
                }
                
                // cell is empty
                if (bank[x2].charAt(y2) == '0') {
                    continue;
                }
                
                // cell is visited or has a beam
                if (beams[x2][y2]) {
                    return false;
                }
                
                stack.push(new int[]{x2, y2});
            }
        }
        
        return true;
    }
    
    private static void mark(String[] bank, boolean[][] beams, boolean[][] visited) {
        int n = bank.length;
        int m = bank[0].length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (beams[i][j]) {
                    visited[i][j] = true;
                }
                beams[i][j] = false;
            }
        }
    }


    
}