package com.codex;

import java.util.*;

public class Solution {
     public static long gridGame(int[][] grid) {
        
        int m = grid[0].length;
        int n = grid.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int cur = grid[i][j];
                int cnt = 0;

                for (int k = 0; k < n; k++) {
                    for (int h = 0; h < m; h++) {
                        if (grid[k][h] >= cur) {
                            cnt++;
                        }
                    }
                }

                if (cnt == n * m) {
                    res += cur;
                    break;
                }
            }
        }
        return res;
    }

    
}