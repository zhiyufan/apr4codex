package com.codex;

import java.util.*;

public class Solution {
public class Main {


    private static int digArtifacts(int n, int[][] artifacts, int[][] dig) {

        if (dig.length == 0) return artifacts.length;
        
        int[][] digRows = new int[dig.length][2];
        int[][] digColumns = new int[dig.length][2];

        for (int i = 0; i < dig.length; i++) {
            digRows[i] = new int[]{dig[i][0], dig[i][1]};
            digColumns[i] = new int[]{dig[i][1], dig[i][0]};
        }
        Arrays.sort(digRows, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        Arrays.sort(digColumns, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int m = artifacts.length, totalArtifacts = m;

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];
            boolean rowCovered = false, colCovered = false;

            for (int j = 0; j < digRows.length; j++) {
                if (digRows[j][0] >= row1 && digRows[j][1] <= row2) {
                    rowCovered = true;
                }
                if (digColumns[j][0] >= col1 && digColumns[j][1] <= col2) {
                    colCovered = true;
                }

                if (rowCovered && colCovered) {
                    break;
                }
            }
            if (!rowCovered || !colCovered) {
                totalArtifacts--;
            }
        }
        return totalArtifacts;
    }


    public static void main(String[] args) {
        int n = 10;
        int[][] artifacts = {{1, 1, 2, 2}, {2, 3, 3, 5}, {6, 7, 8, 9}};
        int[][] dig = {{3, 4}};
        int ans = digArtifacts(n, artifacts, dig);
        System.out.println(ans);
    }
}
}