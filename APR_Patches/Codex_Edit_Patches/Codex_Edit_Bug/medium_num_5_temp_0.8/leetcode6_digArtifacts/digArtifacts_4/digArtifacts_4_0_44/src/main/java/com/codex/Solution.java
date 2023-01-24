package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int m = artifacts.length;
        int totalArtifact = m;

        for (int i = 0; i < m; i++) {
            int r1 = artifacts[i][0];
            int r2 = artifacts[i][2];
            int c1 = artifacts[i][1];
            int c2 = artifacts[i][3];

            if (r1 > r2 || c1 > c2) return 0;

            for (int j = 0; j < dig.length; j++) {
                int digRow = dig[j][0];
                int digCol = dig[j][1];
                if (digRow >= r1 && digRow <= r2) {
                    if (digCol >= c1 && digCol <= c2) {
                        totalArtifact--;
                    }
                }
            }

        }
        return totalArtifacts;
    }

    
}