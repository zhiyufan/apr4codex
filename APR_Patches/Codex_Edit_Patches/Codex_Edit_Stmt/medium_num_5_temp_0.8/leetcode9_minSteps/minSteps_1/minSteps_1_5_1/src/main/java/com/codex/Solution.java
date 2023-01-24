package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
        int pos = -n;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) {
                pos = i;
            }
            res[i] = i - pos;
        }
        for (int j = n - 1; j >= 0; j--) {
            if (S.charAt(j) == C) {
                pos = j;
            }
            res[j] = Math.min(res[j], Math.abs(j - pos));
        }
        return res;
    }
}
}