package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int totalArtifacts = artifacts.length;

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];
            boolean rowCovered = true, colCovered = true;
            
            if (dig.length > 0) {
                rowCovered = false; colCovered = false;
            }

            for (int j = 0; j < dig.length; j++) {
                if (dig[j][0] >= row1 && dig[j][0] <= row2) {
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