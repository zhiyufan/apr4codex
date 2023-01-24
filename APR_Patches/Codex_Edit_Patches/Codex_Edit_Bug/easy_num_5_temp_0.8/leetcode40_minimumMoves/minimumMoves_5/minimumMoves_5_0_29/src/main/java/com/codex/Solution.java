package com.codex;

import java.util.*;

public class Solution {
public static int findPaths(int m, int n, int N, int i, int j) {
        if(m == 1 && n == 1) return 1;
        if(m < 0 || n < 0 || i < 0 || i >= m || j < 0 || j >= n) return 0;
        if(N == 0) return 0;
        return findPaths(m, n, N - 1, i + 1, j) % 1000000007 + findPaths(m, n, N - 1, i, j + 1) % 1000000007 + findPaths(m, n, N - 1, i - 1, j) % 1000000007 + findPaths(m, n, N - 1, i, j - 1) % 1000000007;
    }public static int findPaths(int m, int n, int N, int i, int j) {
        if(m == 1 && n == 1) return 1;
        if(m < 0 || n < 0 || i < 0 || i >= m || j < 0 || j >= n) return 0;
        if(N == 0) return 0;
        return findPaths(m, n, N - 1, i + 1, j) % 1000000007 + findPaths(m, n, N - 1, i, j + 1) % 1000000007 + findPaths(m, n, N - 1, i - 1, j) % 1000000007 + findPaths(m, n, N - 1, i, j - 1) % 1000000007;
    }

   
}