package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0) return artifacts.length;
        int m = artifacts.length, totalArtifacts = m;
        int[] digRow = new int[dig.length];
        int[] digCol = new int[dig.length];

        for (int i = 0; i < dig.length; i++) {
            digRow[i] = dig[i][0];
            digCol[i] = dig[i][1];
        }

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[1], col2 = artifact[3];
            int row1 = artifact[0], row2 = artifact[2];
            boolean rowCovered = false, colCovered = false;
            for (int j = 0; j < digRow.length; j++) {
                if (digRow[j] >= row1 && digRow[j] <= row2) {
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

    public static int knapsack(int capacity, int[] items, int[] values) {
        int[][] T = new int[items.length][capacity + 1];
        for (int i = 0; i < items.length; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 && w >= items[0]) {
                    T[i][w] = values[0];
                } else if (i == 0 && w < items[0]) {
                    T[i][w] = 0;
                } else {
                    if (w >= items[i]) {
                        T[i][w] = Math.max(values[i] + T[i - 1][w - items[i]], T[i - 1][w]);
                    } else {
                        T[i][w] = T[i - 1][w];
                    }
                }
            }
        }
        return T[items.length - 1][capacity];
    }
}