package com.codex;

import java.util.*;

public class Solution {
public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {

    int missingArtifacts = 0;
    boolean[][] isDug = new boolean[n + 1][n + 1];

    for (int i = 0; i < dig.length; i++) {
        isDug[dig[i][0]][dig[i][1]] = true;
    }

    for (int i = 0; i < artifacts.length; i++) {
        int row1 = artifacts[i][0];
        int col1 = artifacts[i][1];
        int row2 = artifacts[i][2];
        int col2 = artifacts[i][3];

        boolean isArtifactFound = false;

        for (int row = row1; row <= row2; row++) {
            if (isArtifactFound) break;

            for (int col = col1; col <= col2; col++) {

                if(!isDug[row][col]) {
                    isArtifactFound = true;
                    break;
                }
            }
        }

        if (!isArtifactFound) missingArtifacts++;
    }

    }

    return missingArtifacts;
}
}