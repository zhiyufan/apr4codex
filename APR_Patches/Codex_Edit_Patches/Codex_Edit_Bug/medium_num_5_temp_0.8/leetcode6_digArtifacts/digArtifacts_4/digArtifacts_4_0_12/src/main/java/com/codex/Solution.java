package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public static int digArtifacts(int n, int[][] artifacts, int[][] dig){
        int m = artifacts.length, totalArtifacts = m;
        for (int row = 0; row < m; row++) {
            int col1 = artifacts[row][1], col2 = artifacts[row][3];
            int row1 = artifacts[row][0], row2 = artifacts[row][2];
            boolean rowCovered = false, colCovered = false, removeArtifact = false;
            for (int i = 0; i < dig.length; i++) {
                if (dig[i][0] >= row1 && dig[i][0] <= row2) {
                    rowCovered = true;        
                }
                if (dig[i][1] >= col1 && dig[i][1] <= col2) {
                    colCovered = true;
                }
                if (dig[i][0] >= row1 && dig[i][0] <= row2 && dig[i][1] >= col1 && 
                    dig[i][1] <= col2) {
                    removeArtifact = true;
                }
            }
            if (!rowCovered || !colCovered || removeArtifact) {
                totalArtifacts--;
            }
        }

        return totalArtifacts;
    }
}

    
}