package com.codex;

import java.util.*;

public class Solution {
    static String[] gridGame(int[][] grid, String[] rules) {
        String[] result = new String[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int[] ex = convert(rules[i]);
            result[i] = "" + transform(grid, i, ex) + transform(grid, i, ex);
        }
        return result;
    }

    
}