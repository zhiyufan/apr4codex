package com.codex;

import java.util.*;

public class Solution {
        if (n <= 1) return 0;
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        if (n <= 2) return f[n];
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
}