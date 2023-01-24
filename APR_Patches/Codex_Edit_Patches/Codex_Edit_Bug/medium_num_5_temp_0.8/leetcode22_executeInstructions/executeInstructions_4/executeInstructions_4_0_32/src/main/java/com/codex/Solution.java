package com.codex;

import java.util.*;

public class Solution {
public static int[] executeInstructions(int n, int[] startPos, String s) {

        int[][] grid = new int[n][n];
        int[] ans = new int[s.length()];

        for (int len = 0; len < s.length(); len++) {
            int[] pos = Arrays.copyOf(startPos, startPos.length);
            boolean canMove = true;
                if (!movePos(grid, pos, s.charAt(j))) {
                    canMove = false;
                    break;
                }
            }
            if (canMove) {
                ans[i] = dir.length;
            }
        }
        return ans;
    }

    
}