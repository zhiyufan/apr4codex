package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0) return artifacts.length;
        int totalArtifacts = artifacts.length;
        Map<Integer, Integer> digRow = new HashMap<>();
        Map<Integer, Integer> digCol = new HashMap<>();

        for (int i = 0; i < dig.length; i++) {
            digRow.put(dig[i][0], dig[i][1]);
            digCol.put(dig[i][1], dig[i][0]);
        }

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];
            boolean rowCovered = false, colCovered = false;
            for (Integer row:digRow.keySet()) {
                if (row >= row1 && row <= row2) {
                    rowCovered = true;
                }
                if (digCol[j] >= col1 && digCol[j] <= col2) {
                    colCovered = true;
                }
            }
            if (!rowCovered || !colCovered) {
                totalArtifacts--;
            }
        }
        return totalArtifacts;
    }

    
}