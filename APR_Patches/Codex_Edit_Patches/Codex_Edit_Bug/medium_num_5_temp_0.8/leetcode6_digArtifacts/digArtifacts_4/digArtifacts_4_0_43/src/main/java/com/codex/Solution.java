package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0) return artifacts.length;
        int m = artifacts.length, totalArtifacts = m;

        for (int i = 0; i < dig.length; i++) {
            boolean rowCovered = false, colCovered = false;
            for (int j = 0; j < artifacts.length; j++) {
                if (dig[i][0] >= artifacts[j][0] && dig[i][0] <= artifacts[j][2]) {
                    rowCovered = true;
                }
                if (dig[i][1] >= artifacts[j][1] && dig[i][1] <= artifacts[j][3]) {
                    colCovered = true;
                }
            }
            if (rowCovered == true && colCovered == true) {
                totalArtifacts--;
            }
        }

        return totalArtifacts;    
    }

    
}