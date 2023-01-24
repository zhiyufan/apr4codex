package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int rows, int cols) {
        if (original.length != rows * cols) return new int[rows][cols];
        int[][] result = new int[rows][cols];
        for (int i = 0; i < original.length; i++) {
            result[i / cols][i % cols] = original[i];
        }
        return result;
    }
}