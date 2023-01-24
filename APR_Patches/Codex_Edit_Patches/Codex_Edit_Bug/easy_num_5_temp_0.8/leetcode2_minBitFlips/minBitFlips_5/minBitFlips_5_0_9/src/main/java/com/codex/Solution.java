package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int[][] A) {
        int N = A.length, M = A[0].length;
        int ret = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (A[i][j] == 0) {
                    flip(A, i, j);
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void flip(int[][] A, int x, int y) {
        int N = A.length, M = A[0].length;
        for (int i = 0; i < N; ++i) {
            A[i][y] = A[i][y] ^ 1;
        }
        for (int j = 0; j < M; ++j) {
            A[x][j] = A[x][j] ^ 1;
        }
        A[x][y] = A[x][y] ^ 1;
    }

    
    
}