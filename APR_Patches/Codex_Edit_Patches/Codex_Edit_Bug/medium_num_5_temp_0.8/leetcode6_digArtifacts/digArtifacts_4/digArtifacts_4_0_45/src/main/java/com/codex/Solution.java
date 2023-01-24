package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0) return artifacts.length;
        int totalArtifacts = m;
        int[] digRow = new int[dig.length];
        int[] digCol = new int[dig.length];

        for (int i = 0; i < dig.length; i++) {
        }

        for (int i = 0; i < digRow.length; i++) {
            for (int j = i + 1; j < digRow.length; j++) {
                if (digRow[i] < digRow[j]) {
                    int temp = digRow[i];
                    digRow[i] = digRow[j];
                    digRow[j] = temp;
                }
            }
        }

        for (int i = 0; i < digCol.length; i++) {
            for (int j = i + 1; j < digCol.length; j++) {
                if (digCol[i] < digCol[j]) {
                    int temp = digCol[i];
                    digCol[i] = digCol[j];
                    digCol[j] = temp;
                }
            }
            digRow[i] = dig[i][0];
            digCol[i] = dig[i][1];
        }

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];

            boolean rowCovered = false;
            if (digRow[0] >= row1 && digRow[digRow.length - 1] <= row2) {
                rowCovered = true;
            } else {
                boolean row = false;
                for (int j = 0; j < digRow.length; j++) {
                    if (digRow[j] >= row1 && digRow[j] <= row2) {
                        row = true;
                    } else {
                        boolean rowCheck = false;
                        for (int k = j + 1; k < digRow.length; k++) {
                            if (digRow[k] >= row1 && digRow[k] <= row2) {
                                rowCheck = true;
                                break;
                            }
                        }
                        row = rowCheck;
                        break;
                    }
                }
                rowCovered = row;
            }

            boolean colCovered = false;
            if (digCol[0] >= col1 && digCol[digCol.length - 1] <= col2) {
                colCovered = true;
            } else {
                boolean col = false;
                for (int j = 0; j < digCol.length; j++) {
                    if (digCol[j] >= col1 && digCol[j] <= col2) {
                        col = true;
                    } else {
                        boolean colCheck = false;
                        for (int k = j + 1; k < digCol.length; k++) {
                            if (digCol[k] >= col1 && digCol[k] <= col2) {
                                colCheck = true;
                                break;
                            }
                        }
                        col = colCheck;
                        break;
                    }
                }
                colCovered = col;
            }

            if (!rowCovered || !colCovered) {
                totalArtifacts--;
            }
        }
        return totalArtifacts;
    }

    
}