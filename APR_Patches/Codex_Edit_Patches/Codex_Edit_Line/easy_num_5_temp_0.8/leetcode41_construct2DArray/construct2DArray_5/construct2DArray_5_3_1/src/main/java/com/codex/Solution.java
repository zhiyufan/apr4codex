package com.codex;

import java.util.*;

public class Solution {
package ex2;
import java.util.Arrays;
public class Ex1 {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        

        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i * result[0].length + j >= original.length) {
                    throw new IllegalArgumentException();
                } else {
                    result[i][j] = original[i * result[0].length + j];
                }
            }
        }
        return result;
    }
}
}